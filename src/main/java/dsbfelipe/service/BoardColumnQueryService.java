package dsbfelipe.service;

import dsbfelipe.persistence.dao.BoardColumnDAO;
import dsbfelipe.persistence.entity.BoardColumnEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class BoardColumnQueryService {

  private final Connection connection;

  public Optional<BoardColumnEntity> findById(final Long id) throws SQLException {
    var dao = new BoardColumnDAO(connection);
    return dao.findById(id);
  }

}