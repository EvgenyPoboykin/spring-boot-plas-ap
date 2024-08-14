
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TYPE discipline AS ENUM (
 'squat',
 'bench_press',
 'dead_lift'
);

CREATE TABLE IF NOT EXISTS public.athlete (
    id uuid PRIMARY KEY NOT NULL DEFAULT (uuid_generate_v4()),
    profile_image BI,
    firstname varchar NOT NULL,
    lastname varchar NOT NULL,
    born varchar TIMESTAMP NOT NULL,
    city varchar NOT NULL,
    federation varchar,
    created_at varchar TIMESTAMP NOT NULL,
    updated_at varchar TIMESTAMP NOT NULL,
);

CREATE TABLE IF NOT EXISTS public.tournament (
    id uuid PRIMARY KEY NOT NULL DEFAULT (uuid_generate_v4()),
    name varchar NOT NULL,
    is_closed BOOLEAN DEFAULT FALSE,
    formula varchar NOT NULL,
    attempts INTEGER DEFAULT 3,
    squat BOOLEAN DEFAULT TRUE,
    bench_press BOOLEAN DEFAULT FALSE,
    dead_lift BOOLEAN DEFAULT FALSE,
    created_at varchar TIMESTAMP NOT NULL,
    updated_at varchar TIMESTAMP NOT NULL,
);

CREATE TABLE IF NOT EXISTS public.tournament_athlete (
    id uuid PRIMARY KEY NOT NULL DEFAULT (uuid_generate_v4()),
    tournament_id uuid REFERENCES public.tournament(id),
    athlete_id uuid REFERENCES public.athlete(id),
    self_weight FLOAT NOT NULL,
    created_at varchar TIMESTAMP NOT NULL,
    updated_at varchar TIMESTAMP NOT NULL,
    squat BOOLEAN DEFAULT TRUE,
    bench_press BOOLEAN DEFAULT FALSE,
    dead_lift BOOLEAN DEFAULT FALSE,
);

CREATE TABLE IF NOT EXISTS public.tournament_athlete_discipline (
    id uuid PRIMARY KEY NOT NULL DEFAULT (uuid_generate_v4()),
    tournament_id uuid REFERENCES public.tournament(id),
    athlete_id uuid REFERENCES public.athlete(id),
    discipline discipline,
    attempt_1 INTEGER DEFAULT 0,
    attempt_2 INTEGER DEFAULT 0,
    attempt_3 INTEGER DEFAULT 0,
    attempt_4 INTEGER DEFAULT 0,
    attempt_5 INTEGER DEFAULT 0,
    created_at varchar TIMESTAMP NOT NULL,
    updated_at varchar TIMESTAMP NOT NULL,
);

