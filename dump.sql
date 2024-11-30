--
-- PostgreSQL database dump
--

-- Dumped from database version 17.0 (Debian 17.0-1.pgdg120+1)
-- Dumped by pg_dump version 17.0 (Debian 17.0-1.pgdg120+1)


SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: fm_users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.fm_users (
    userid integer NOT NULL,
    phone_number character varying(15) NOT NULL,
    email_id character varying(255) NOT NULL,
    date_of_birth date,
    password text NOT NULL,
    name character varying(100),
    last_name character varying(100)
);


ALTER TABLE public.fm_users OWNER TO postgres;

--
-- Name: fm_users_userid_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.fm_users_userid_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.fm_users_userid_seq OWNER TO postgres;

--
-- Name: fm_users_userid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.fm_users_userid_seq OWNED BY public.fm_users.userid;


--
-- Name: fm_users userid; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fm_users ALTER COLUMN userid SET DEFAULT nextval('public.fm_users_userid_seq'::regclass);


--
-- Data for Name: fm_users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.fm_users (userid, phone_number, email_id, date_of_birth, password, name, last_name) FROM stdin;
1	1234567890	john.doe@example.com	1990-01-01	hashed_password1	John	Doe
2	0987654321	jane.smith@example.com	1992-02-02	hashed_password2	Jane	Smith
3	5551234567	michael.jones@example.com	1985-03-03	hashed_password3	Michael	Jones
4	5142262699	shiveshc710@gmail.com	2024-06-04	$2a$10$vVKlJ87BV71RAO3hr4ZMMOmGNqOWHZH7SigC74A7o2HpUJNoxtx5S	Shivesh	Chaudhary
\.


--
-- Name: fm_users_userid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.fm_users_userid_seq', 16, true);


--
-- Name: fm_users fm_users_email_id_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fm_users
    ADD CONSTRAINT fm_users_email_id_key UNIQUE (email_id);


--
-- Name: fm_users fm_users_phone_number_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fm_users
    ADD CONSTRAINT fm_users_phone_number_key UNIQUE (phone_number);


--
-- Name: fm_users fm_users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fm_users
    ADD CONSTRAINT fm_users_pkey PRIMARY KEY (userid);


--
-- PostgreSQL database dump complete
--

