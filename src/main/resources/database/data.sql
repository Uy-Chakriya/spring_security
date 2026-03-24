CREATE TABLE if not exists app_users
(
    user_id   SERIAL PRIMARY KEY,
    full_name VARCHAR(255),
    email     VARCHAR(255) NOT NULL,
    password  VARCHAR(255) NOT NULL
);

CREATE TABLE if not exists app_roles
(
    role_id SERIAL PRIMARY KEY,
    name    VARCHAR(20) NOT NULL
);

CREATE TABLE if not exists app_user_role
(
    user_id INT NOT NULL REFERENCES app_users (user_id) ON DELETE CASCADE ON UPDATE CASCADE,
    role_id INT NOT NULL REFERENCES app_roles (role_id) ON DELETE CASCADE ON UPDATE CASCADE,
    PRIMARY KEY (user_id, role_id)
);