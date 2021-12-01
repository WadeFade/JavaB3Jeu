CREATE TABLE IF NOT EXISTS public."User"
(
    id SERIAL NOT NULL,
    pseudo character varying(50) UNIQUE COLLATE pg_catalog."default" NOT NULL,
    email character varying(50) UNIQUE COLLATE pg_catalog."default",
    "gamePlayed" bigint,
    score bigint,
    password character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT "User_pkey" PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public."User"
    OWNER to postgres;

