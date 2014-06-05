import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import edw.olingo.model.Meeting;
import edw.olingo.model.MeetingTitle;

@RunWith(BlockJUnit4ClassRunner.class)
public class JpaTest {

	private static final String PERSISTENCE_UNIT_NAME = "persistence_unit";
	private EntityManagerFactory factory;

	@Before
	public void setUp() throws Exception {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	@Test
	public void test() throws Exception {
		EntityManager em = factory.createEntityManager();
		Query q = em.createQuery("select e from AiEvent e");
		List list = q.getResultList();
		assertEquals(1396, list.size());
		em.close();
	}

	@Test
	public void test2() throws Exception {
		EntityManager em = factory.createEntityManager();
		Query q = em.createQuery("select m from Meeting m where m.id = :id");
		q.setParameter("id", 1517);
		Meeting m = (Meeting) q.getSingleResult();
		assertEquals("unccd", m.getTreaty());
		assertEquals(1517, m.getMeetingTitle().getId());
		em.close();
	}

	@Test
	public void test3() throws Exception {
		EntityManager em = factory.createEntityManager();
		Query q = em.createQuery("select m from MeetingTitle m where m.id = :id");
//		q.setParameter("id", "1517-en");
		q.setParameter("id", 1517);
		MeetingTitle m = (MeetingTitle) q.getSingleResult();

		assertEquals(1517, m.getMeeting().getId());
		assertEquals("unccd", m.getMeeting().getTreaty());
		em.close();
	}
}