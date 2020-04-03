package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{

	String[] offensiveWords = {"whorebag","whored","whoreface","whorehopper","whorehouse","whores","whoring","wigger","willies","willy","window licker","wiseass","wiseasses","wog","womb","wop","wrapping men","wrinkled starfish","wtf","xrated","x-rated","xx","xxx","yaoi","yeasty","yellow showers","yid","yiffy","yobbo","zibbi","zoophilia","zubb"};
	
	public boolean checkBlogTitle(Blog blog) {
		String title = blog.getBlogTitle();
		for(String str:offensiveWords) {
			if(title.contains(str))
				return false;
		}
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		String title = blog.getBlogTitle();
		for(String str:offensiveWords) {
			if(title.contains(str))
				return false;
		}
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		return  (checkBlogTitle(blog) && checkBlogDescription(blog));
	}
	
}