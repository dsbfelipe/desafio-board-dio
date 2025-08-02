package dsbfelipe.service;

import dsbfelipe.dto.CardDetailsDTO;
import dsbfelipe.persistence.dao.CardDAO;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class CardQueryService {

  private final Connection connection;

  public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
    var dao = new CardDAO(connection);
    return dao.findById(id);
  }

}