import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books = new ArrayList<Book>();
    public ArrayList<Member> members = new ArrayList<Member>();

    public void addMember(Member member) {
        this.members.add(member);
    }

    public Boolean isMemberIdExist(String id) {
        Boolean isExist = false;
        for (Member member : this.members) {
            if (member.id == id) {
                isExist = true;
            }
        }
        return isExist;
    }

    public void giveBook(String bookId, String memberId) {
    }

    public void receiveBook(String bookId, String memberId) {
    }

    private int getMemberIndex(Member member) {
        return this.members.indexOf(member);
    }

    private Member getMemberById(String id) {
        for (Member member : this.members) {
            if (member.id.equals(id)) {
                return member;
            }
        }
        return null;
    }

    private Book getBookById(String id) {
        for (Book book : this.books) {
            if (book.id.equals(id)) {
                return book;
            }
        }
        return null;
    }
}
