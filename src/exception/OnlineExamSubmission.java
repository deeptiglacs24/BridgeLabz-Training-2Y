package exception;
import java.time.LocalDateTime;

//Custom Exceptions
class LateSubmissionException extends Exception {
 public LateSubmissionException(String message) {
     super(message);
 }
}

class InvalidFileFormatException extends Exception {
 public InvalidFileFormatException(String message) {
     super(message);
 }
}

public class OnlineExamSubmission {

 // Hardcoded deadline
 private static final LocalDateTime DEADLINE = LocalDateTime.of(2025, 11, 10, 23, 59);

 // Method to submit exam
 public static void submitExam(String fileName, LocalDateTime submissionTime)
         throws LateSubmissionException, InvalidFileFormatException {

     if (!fileName.endsWith(".pdf")) {
         throw new InvalidFileFormatException("Only PDF files are allowed!");
     }

     if (submissionTime.isAfter(DEADLINE)) {
         throw new LateSubmissionException("Submission is late! Deadline was: " + DEADLINE);
     }

     System.out.println("✅ Exam submitted successfully: " + fileName);
 }

 // Main method
 public static void main(String[] args) {
     System.out.println("=== Online Exam Submission ===");

     try {
         // You can modify the time to test
         LocalDateTime now = LocalDateTime.now();

         submitExam("Exam_Answers.docx", now);  // Invalid format
         // submitExam("Exam_Answers.pdf", now.plusDays(1)); // Late
         // submitExam("Exam_Answers.pdf", now); // Successful

     } catch (InvalidFileFormatException e) {
         System.out.println("❌ Error: " + e.getMessage());
     } catch (LateSubmissionException e) {
         System.out.println("❌ Error: " + e.getMessage());
     } finally {
         System.out.println("Submission process completed.");
     }
 }
}
