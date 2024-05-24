package in.kunal.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kunal.common.Constants;
import in.kunal.model.Issue;
import in.kunal.model.Member;
import in.kunal.repository.IssueRepository;

@Service
public class IssueService {

	@Autowired
	private IssueRepository issueRepository;
	
	public List<Issue> getAll() {
		return issueRepository.findAll();
	}
	
	public Issue get(Long id) {
		return issueRepository.findById(id).get();
	}
	
	public List<Issue> getAllUnreturned() {
		return issueRepository.findByReturned( Constants.BOOK_NOT_RETURNED );
	}
	
	public Issue addNew(Issue issue) {
		issue.setIssueDate( new Date() );
		issue.setReturned( Constants.BOOK_NOT_RETURNED );
		return issueRepository.save(issue);
	}
	
	public Issue save(Issue issue) {
		return issueRepository.save(issue);
	}
	
	public Long getCountByMember(Member member) {
		return issueRepository.countByMemberAndReturned(member, Constants.BOOK_NOT_RETURNED);
	}
}
