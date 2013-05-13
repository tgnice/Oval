package org.araqne.oval.datamodel.definitionsmodel;

public class FunctionGroup {

	private ArithmeticFunctionType arithmetic;
	private BeginFunctionType begin;
	private ConcatFunctionType concat;
	private CountFunctionType count;
	private EndFunctionType end;
	private EscapeRegexFunctionType escapeRefex;
	private SplitFunctionType split;
	private SubstringFunctionType substring;
	private TimeDifferenceFunctionType timeDifference;
	private UniqueFunctionType unique;
	private RegexCaptureFunctionType regexCapture;

	public ArithmeticFunctionType getArithmetic() {
		return arithmetic;
	}

	public void setArithmetic(ArithmeticFunctionType arithmetic) {
		this.arithmetic = arithmetic;
	}

	public BeginFunctionType getBegin() {
		return begin;
	}

	public void setBegin(BeginFunctionType begin) {
		this.begin = begin;
	}

	public ConcatFunctionType getConcat() {
		return concat;
	}

	public void setConcat(ConcatFunctionType concat) {
		this.concat = concat;
	}

	public CountFunctionType getCount() {
		return count;
	}

	public void setCount(CountFunctionType count) {
		this.count = count;
	}

	public EndFunctionType getEnd() {
		return end;
	}

	public void setEnd(EndFunctionType end) {
		this.end = end;
	}

	public EscapeRegexFunctionType getEscapeRefex() {
		return escapeRefex;
	}

	public void setEscapeRefex(EscapeRegexFunctionType escapeRefex) {
		this.escapeRefex = escapeRefex;
	}

	public SplitFunctionType getSplit() {
		return split;
	}

	public void setSplit(SplitFunctionType split) {
		this.split = split;
	}

	public SubstringFunctionType getSubstring() {
		return substring;
	}

	public void setSubstring(SubstringFunctionType substring) {
		this.substring = substring;
	}

	public TimeDifferenceFunctionType getTimeDifference() {
		return timeDifference;
	}

	public void setTimeDifference(TimeDifferenceFunctionType timeDifference) {
		this.timeDifference = timeDifference;
	}

	public UniqueFunctionType getUnique() {
		return unique;
	}

	public void setUnique(UniqueFunctionType unique) {
		this.unique = unique;
	}

	public RegexCaptureFunctionType getRegexCapture() {
		return regexCapture;
	}

	public void setRegexCapture(RegexCaptureFunctionType regexCapture) {
		this.regexCapture = regexCapture;
	}

}
