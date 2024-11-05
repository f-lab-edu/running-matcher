-- V0.0.3__create_runmble_request_table.sql
CREATE TABLE IF NOT EXISTS runmble_request (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    runmble_id BIGINT NOT NULL,
    requester_id BIGINT NOT NULL,
    request_time DATETIME NOT NULL,
    status ENUM('PENDING', 'ACCEPTED', 'REJECTED') NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT fk_runmble FOREIGN KEY (runmble_id) REFERENCES runmbles(id),
    CONSTRAINT fk_requester FOREIGN KEY (requester_id) REFERENCES users(id)
    ) ENGINE=InnoDB;