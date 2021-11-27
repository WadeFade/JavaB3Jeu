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

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user7','user@user7.fr',1,668,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user8','user@user8.fr',1,669,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user9','user@user9.fr',1,670,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user10','user@user10.fr',1,671,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user11','user@user11.fr',1,672,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user12','user@user12.fr',1,673,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user13','user@user13.fr',1,674,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user14','user@user14.fr',1,675,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user15','user@user15.fr',1,676,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user16','user@user16.fr',1,677,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user17','user@user17.fr',1,678,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user18','user@user18.fr',1,679,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user19','user@user19.fr',1,680,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user20','user@user20.fr',1,681,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user21','user@user21.fr',1,682,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user22','user@user22.fr',1,683,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user23','user@user23.fr',1,684,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user24','user@user24.fr',1,685,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user25','user@user25.fr',1,686,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user26','user@user26.fr',1,687,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user27','user@user27.fr',1,688,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user28','user@user28.fr',1,689,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user29','user@user29.fr',1,690,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user30','user@user30.fr',1,691,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user31','user@user31.fr',1,692,'123');

INSERT INTO public."User"(
    pseudo, email, "gamePlayed", score, password)
VALUES ('user32','user@user32.fr',1,693,'123');