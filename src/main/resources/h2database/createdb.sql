CREATE TABLE IF NOT EXISTS UNIVERSITY
(
	ID INTEGER NOT NULL IDENTITY,
	TITLE            VARCHAR(50),
	OPT_LOCK_VERSION INTEGER,
	PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS STUDENT
(
	ID INTEGER NOT NULL IDENTITY,
	FIRST_NAME       VARCHAR(20),
	LAST_NAME        VARCHAR(20),
	UNIVERSITY_ID    INTEGER,
	REGISTRATION_NO  VARCHAR(20),
	OPT_LOCK_VERSION INTEGER,
	PRIMARY KEY (ID),
	FOREIGN KEY (UNIVERSITY_ID) REFERENCES UNIVERSITY (ID)
);

CREATE TABLE IF NOT EXISTS COURSE
(
	ID INTEGER NOT NULL IDENTITY,
	NAME             VARCHAR(50),
	OPT_LOCK_VERSION INTEGER,
	PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS STUDENT_COURSE
(
	STUDENT_ID      INTEGER,
	COURSE_ID       INTEGER,
	PRIMARY KEY (STUDENT_ID, COURSE_ID),
	FOREIGN KEY (STUDENT_ID) REFERENCES STUDENT (ID),
	FOREIGN KEY (COURSE_ID) REFERENCES COURSE (ID)
);

CREATE TABLE IF NOT EXISTS ACCOUNT
(
  ID INTEGER NOT NULL IDENTITY,
  USER_NAME        VARCHAR(128) NOT NULL UNIQUE,
  PASSWORD_DIGEST  VARCHAR(256) NOT NULL,
  FIRST_NAME       VARCHAR(20),
  LAST_NAME        VARCHAR(20),
  PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS ACCOUNT_GROUP
(
  ACCOUNT_ID       INTEGER,
  GROUP_NAME       VARCHAR(128),
  PRIMARY KEY (ACCOUNT_ID, GROUP_NAME),
  FOREIGN KEY (ACCOUNT_ID) REFERENCES ACCOUNT (ID)
);

CREATE TABLE IF NOT EXISTS EXTRACURRICULUM_ACTIVITY
(
  ID INTEGER,
  NAME VARCHAR(128),
  DESCRIPTION VARCHAR(128),
  PRIMARY KEY (ID)
);