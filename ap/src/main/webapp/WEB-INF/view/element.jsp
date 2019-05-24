<li>
	<c:if test="${mode eq 1}">
		<input type="checkbox" id="checkbox_${child.id}" onclick="toggleCheckbox(this)" ${child.isChecked ? "checked" : ""}>
	</c:if>
	<p>
		<c:if test="${child.isChecked}"><del></c:if>
			${child.title}
		<c:if test="${child.isChecked}"></del></c:if>
		&nbsp;
	</p>
	<p>
		<input type="button" onclick="toggleAddMode(this)" value="+" class="btn addButton">
	</p>
	<p>
		<input type="button" onclick="toggleEditMode(this)" value="edit" class="btn editButton">
	</p>
	<c:if test="${child.isRoot == false}">
		<s:form>
			<input type="submit" name="up" value="↑" class="btn">
			<input type="hidden" name="targetId" value="${child.id}">
			<input type="hidden" name="mode" value="${mode}">
		</s:form>
	</c:if>
	<s:form>
		<input type="submit" name="remove" value="-" class="btn">
		<input type="hidden" name="targetId" value="${child.id}">
		<input type="hidden" name="mode" value="${mode}">
	</s:form>
	<div class="addBlock">
		<s:form>
			<textarea name="addText" rows="3" cols="30"></textarea>
			<input type="submit" name="add" value="add" class="btn">
			<input type="hidden" name="targetId" value="${child.id}">
			<input type="hidden" name="mode" value="${mode}">
		</s:form>
	</div>
	<div class="editBlock">
		<s:form>
			<textarea name="editText" rows="3" cols="30">${child.title}</textarea>
			<input type="submit" name="update" value="update" class="btn">
			<input type="hidden" name="targetId" value="${child.id}">
			<input type="hidden" name="mode" value="${mode}">
		</s:form>
	</div>
	<ul>
		<c:if test="${child.children != null}">
			<c:forEach var="child" items="${child.children}" varStatus="childStatus">
				<c:set var="child" value="${child}" scope="request"></c:set>
				<c:import url="element.jsp"></c:import>
			</c:forEach>
		</c:if>
	</ul>
</li>
