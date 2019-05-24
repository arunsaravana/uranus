create table mst_element (
  id serial PRIMARY KEY,
  type integer,
  title text,
  is_checked boolean,
  is_root boolean,
  create_date date,
  update_date date
);

create table mst_relation (
  parent_id integer,
  child_id integer,
  PRIMARY KEY (parent_id, child_id)
); 