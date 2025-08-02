package dsbfelipe;

import dsbfelipe.persistence.migration.MigrationStrategy;
import dsbfelipe.ui.MainMenu;

import java.sql.SQLException;

import static dsbfelipe.persistence.config.ConnectionConfig.getConnection;


public class Main {

  public static void main(String[] args) throws SQLException {
    try(var connection = getConnection()){
      new MigrationStrategy(connection).executeMigration();
    }
    new MainMenu().execute();
  }

}