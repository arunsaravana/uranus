#!/bin/bash
service postgresql-9.6 start
psql -U postgres -c "create role uranus superuser login"
createdb -U postgres -O uranus uranusdb
psql -U uranus uranusdb -c \
"create table mst_element ( \
  id serial PRIMARY KEY, \
  type integer, \
  title text, \
  is_checked boolean, \
  is_root boolean, \
  create_date date, \
  update_date date \
);"

psql -U uranus uranusdb -c \
"create table mst_relation ( \
  parent_id integer, \
  child_id integer, \
  PRIMARY KEY (parent_id, child_id) \
);"

/bin/bash
