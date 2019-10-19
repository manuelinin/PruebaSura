CREATE TABLE datos_smile
(
  id_dato serial NOT NULL,
  ds_frase text NOT NULL,
  url_foto text NOT NULL,
  CONSTRAINT datos_smile_pkey PRIMARY KEY (id_dato)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE datos_smile
  OWNER TO postgres;