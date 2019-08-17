package chapter20.exercises.e08;
/**
 * Exercise 20.08   Pair
 */
public class Pair<F, S> {

	F first;
	S second;

	public Pair(F first, S second) {
		super();
		this.first = first;
		this.second = second;
	}

	public F getFirst() {
		return first;
	}

	public void setFirst(F first) {
		this.first = first;
	}

	public S getSecond() {
		return second;
	}

	public void setSecond(S second) {
		this.second = second;
	}

}
