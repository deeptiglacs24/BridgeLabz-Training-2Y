package exception;
class InvalidRatingException extends Exception {
    public InvalidRatingException(String message) {
        super(message);
    }
}

class EmptyReviewException extends Exception {
    public EmptyReviewException(String message) {
        super(message);
    }
}

public class ProductReviewSystem {

    public static void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {
        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException("Rating must be between 1 and 5!");
        }
        if (comment == null || comment.trim().isEmpty()) {
            throw new EmptyReviewException("Review comment cannot be empty!");
        }
        System.out.println("✅ Review submitted successfully! Rating: " + rating + " Comment: " + comment);
    }

    public static void main(String[] args) {
        System.out.println("=== Product Review System ===");
        try {
            submitReview(6, "Good product!"); // Invalid rating
        } catch (InvalidRatingException e) {
            System.out.println("❌ Rating error: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("❌ Review error: " + e.getMessage());
        }
    }
}
