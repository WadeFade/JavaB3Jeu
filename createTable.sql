CREATE TABLE IF NOT EXISTS public."User"
(
    id SERIAL NOT NULL,
    pseudo character varying(50) UNIQUE COLLATE pg_catalog."default" NOT NULL,
    email character varying(50) UNIQUE COLLATE pg_catalog."default",
    "gamePlayed" bigint,
    score bigint,
    password character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT "User_pkey" PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public."User"
    OWNER to postgres;


INSERT INTO public."User"(
	pseudo, email, "gamePlayed", score, password)
	VALUES ('user1','user@user1.fr',1,1,'123');

INSERT INTO public."User"(
	pseudo, email, "gamePlayed", score, password)
	VALUES ('user2','user@user2.fr',1,2,'123');

INSERT INTO public."User"(
	pseudo, email, "gamePlayed", score, password)
	VALUES ('user3','user@user3.fr',1,32,'123');

INSERT INTO public."User"(
	pseudo, email, "gamePlayed", score, password)
	VALUES ('user4','user@user4.fr',1,44,'123');


INSERT INTO public."User"(
	pseudo, email, "gamePlayed", score, password)
	VALUES ('user5','user@user5.fr',1,666,'123');

INSERT INTO public."User"(
	pseudo, email, "gamePlayed", score, password)
	VALUES ('user6','user@user6.fr',1,667,'123');