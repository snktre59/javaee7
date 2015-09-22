package org.kearis.formation.javaee7.chapitre1_1.ex29;

import org.kearis.formation.javaee7.chapitre1_1.AbstractPersistentTest;
import org.junit.Ignore;
import org.junit.Test;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.Date;

public class StoredProcedure29IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test @Ignore
  public void shouldCallANamedStoredProcedureQuery() throws Exception {

    StoredProcedureQuery query = em.createNamedStoredProcedureQuery("archiveOldBooks");

    // Set the parameters and execute
    query.setParameter("archiveDate", new Date());
    query.setParameter("maxBookArchived", 1000);
    query.execute();
  }

  @Test @Ignore
  public void shouldCallAStoredProcedureQuery() throws Exception {

    StoredProcedureQuery query = em.createStoredProcedureQuery("sp_archive_old_books");
    query.registerStoredProcedureParameter("archiveDate", Date.class, ParameterMode.IN);
    query.registerStoredProcedureParameter("maxBookArchived", Integer.class, ParameterMode.IN);

    // Set the parameters and execute
    query.setParameter("archiveDate", new Date());
    query.setParameter("maxBookArchived", 1000);
    query.execute();
  }
}