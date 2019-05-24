<!DOCTYPE html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>Uranus</title>
		<link rel="stylesheet" href="${f:url('/css/index.css')}">
		<noscript>
			<link rel="stylesheet" href="${f:url('/css/noscript.css')}">
		</noscript>
	</head>
	<body>
		<!-- header -->
		<h1>
			<c:choose>
				<c:when test="${mode eq 0}">
					[ Memo ] /
					<s:link href="task">Task</s:link>
				</c:when>
				<c:otherwise>
					<s:link href="memo">Memo</s:link>
					/ [ Task ]
				</c:otherwise>
			</c:choose>
		</h1>
		<p>
			<!-- create button -->
			<input type="button" onclick="toggleCreateMode()" value="new" class="btn createButton">
			<!-- clear section -->
			<div id="clearButton">
				<s:form>
					<input type="submit" name="clear" value="clear" class="btn">
					<input type="hidden" name="mode" value="${mode}">
				</s:form>
			</div>
		</p>
		<!-- create block -->
		<div id="createBlock">
			<s:form>
				<textarea name="inputText" rows="3" cols="30"></textarea>
				<input type="submit" name="create" value="create" class="btn">
				<input type="hidden" name="mode" value="${mode}">
			</s:form>
		</div>
		<!-- main contents -->
		<ul>
			<c:forEach var="elm" items="${list}" varStatus="parentStatus">
				<c:if test="${mode eq 1}">
					<c:if test="${elm.updateDate.toString() != date}">
						<p>
							<h2>
								${elm.updateDate}
							</h2>
							<c:set var="date" value="${elm.updateDate.toString()}" scope="request"></c:set>
						</p>
					</c:if>
				</c:if>
				<c:set var="child" value="${elm}" scope="request"></c:set>
				<c:import url="element.jsp"></c:import>
				<br>
			</c:forEach>
		</ul>
		<script type="text/javascript" src="${f:url('/js/index.js')}"></script>
	</body>
</html>
