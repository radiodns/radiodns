package eu.hradio.core.radiodns.radioepg.genre;

import java.util.HashMap;

public class TvaFormatCs {

	public static String getFormat(String termId) {
		String ret = mFormatCs2011.get(termId);
		if(ret != null) {
			return ret;
		}

		return "";
	}

	private final static HashMap<String, String> mFormatCs2011 = new HashMap<String, String>() {
		{
			put("2.0", "Proprietary"); //For use where proprietary extensions are required, or the use of keywords that do not fit in any classification below
			put("2.1", "STRUCTURED"); //All programmes dealing with facts, situations, opinions, theories and forecasts
			put("2.1.1 ", "Bulletin"); //Programme with formal desk presentation, usually interspersed with visual material.Example: news bulletin, weather forecast
			put("2.1.2", "Magazine"); //Programme consisting of separate items which has at least one common quality and presented under one main heading
			put("2.1.2.1", "Presenter led magazine"); //Presenter led programmeconsisting different elements
			put("2.1.2.2", "Clip led magazine"); //Programme dominated or completely consisting of self contained video clips
			put("2.1.3", "Event"); //An outside event covered by the broadcaster and with an accompanying commentary and transmitted live or deferred (within 24 hours). Example: Soccer match, theatre relay, parliamentary debate
			put("2.1.3.1", "Commented event"); //An outside event covered by the broadcaster and with an accompanying commentary, and transmitted live or deferred (within 2. hours).
			put("2.1.3.2", "Uncommented event"); //Where the event speaks for itself.. Ie Religious service,
			put("2.1.4", "Documentary"); //Programme concerning a single theme, involving descriptive and/or interpretative commentaries, illustrations, I/vs, statements, photos etc
			put("2.1.4.1", "Archive clips documentary"); //Documentary consisting mostly or completely of selected clips of archive media
			put("2.1.5", "Discussion/Interview/Debate/Talkshow"); //Mainly verbal programme in which more than one person participates
			put("2.1.6", "Lecture/Speech/Presentation"); //Mainly verbal programme in which only one person participates
			put("2.1.7", "Textual (incl. relayed teletext)"); //Programme consisting only of alphanumerical information
			put("2.1.8", "Phone-in"); //Programme with content primarily generated by contributions from the general audience either on the telephone or by sending in emails/letters
			put("2.1.9", "DJ with discs"); //Programme (usually in audio only) in which a specialist presenter introduces music or other pre-recorded elements
			put("2.1.10", "Charitable Appeal"); //Programme devoted to an appeal for donations to a particular charitable cause
			put("2.1.11", "Party-political broadcast"); //Programme promoting the views and/or policies of a political party, especially during an election campaign
			put("2.2", "REPRESENTATION/PLAY"); //Programme consisting of a prose or verse composition, one telling a story, written for or as if for performance by actors.Examples: soap opera, Shakespeare play, Monthy Python, radio play, Not: documentary or informational programme whose subject is drama
			put("2.2.1", "Fictional portrayal of life"); //Programme performed by live actors e.g. Performed drama
			put("2.2.2", "Readings"); //Programmes consisting of readings of poems, stories or other literary works
			put("2.2.3", "Dramatic documentary"); //Programme performed by actors. About real events e.g. Docusoap or docudrama
			put("2.3", "CARTOON/ANIMATION/PUPPETRY"); //Programme consisting of a dramatic work, constructed frame by frame without resource to live images
			put("2.3.1", "Anime"); //Japanese animation style
			put("2.3.2", "Computer"); //CGI or 3D representationExamples: Disney's Antz, Toy STory, etc.
			put("2.3.3", "Cartoon"); //Images drawn frame by frame. Example: Disneys Pinocchio, The Flintstones, Tom and Jerry
			put("2.3.4", "Puppetry"); //Programme consisting of a dramatic work, performed with puppet/claymation.
			put("2.3.4.1", "Real time puppetry"); //marrionettes such as Thunderbirds
			put("2.3.4.2", "Physical model animation"); //claymation such as Gumbi and Poky, Chicken Run, Wallace and Gromit
			put("2.4", "SHOW");
			put("2.4.1", "Hosted show"); //Programme, that can be regarded neither as non-fiction nor as drama or music/dance in which one or more persons fulfil the role of presenter, host, quiz or games master, announcer, chairperson or speaker and where the rest of the participants are generally members of the public
			put("2.4.1.1", "Simple game show"); //Programme in which the content is primarily contained within the studio and the prizes or rewards (if any) to the participant(s) may be regarded as conservative. Example: University Challenge
			put("2.4.1.2", "Big game show"); //Programme produced on a grand scale in which the prizes or rewards are considered generous Example: Who wants to be a millionaire
			put("2.4.1.3", "Telethon"); //A very long programme, typically made up of many shorter elements or items, and devoted to a single over-arching purpose, usually a charitable appeal
			put("2.4.2", "Panel-show"); //A programme of a light entertainment nature which is presented by a more or less fixed group of people (panel). Programme, that can be regarded neither as non-fiction nor as drama or concert. Example: The Paul Daniels Show; Der Rudi Carrell Show
			put("2.4.2.1", "Simple game show"); //see 2.4.1.1
			put("2.4.2.2", "Big game show"); //see 2.4.1.2
			put("2.4.3", "Non-hosted show"); //Programme, that can be regarded neither as non-fiction nor as drama or music/dance in which no one fulfils the role of presenter, host, quiz or games master, announcer, chairperson or speaker
			put("2.4.4", "Standup comedian(s)"); //Programme performed by a single, a pair or a group of comedians performing directly towards the audience
			put("2.4.5", "Reality Show");
			put("2.4.5.1", "Observational show"); //where fly on the wall techniques are central to the programme structure
			put("2.4.5.2", "Controlled show"); //where the flow of the programme is governed - rules based
			put("2.4.5.3", "Makeover show"); //Experts collaborate to change the appearance or image of a person or thing (e.g. a garden or house), or to modify the behaviour of a person.
			put("2.4.6", "Clips show"); //Programme centred on clips from other material, e.g. an "out-takes" show.
			put("2.5", "ARTISTIC PERFORMANCE"); //Music, Dance, Mime etc. TV programmes (predominantly) consisting of music, dance or ballet or theatrical performance
			put("2.5.1", "Solo performance"); //individual performance of music, dance, mime or spoken word eg Nigel Kennedy solo violin performance
			put("2.5.2", "Small ensemble performance"); //Performance of music, dance, mime or spoken word by a small number of people Quartet, small ensemble staged play
			put("2.5.3", "Large ensemble performance"); //Performance of music, dance, mime or spoken word by a large number of people Orchestra and choirs
			put("2.5.4", "Mixed");
			put("2.5.5", "Music video"); //Short film made specifically to promote the musical recording that forms its soundtrack, and usually visibly featuring the promoted performer(s).
			put("2.6", "void"); //Term not defined
			put("2.7", "INTERACTIVE"); //Formats making use of a range of features such as local application support, return path and direct viewer interaction
			put("2.7.1", "LOCAL INTERACTIVITY"); //Formats that happen in the "box" where broadcast "data" is processed locally giving a sense of dynamic choice
			put("2.7.1.1", "Static informational"); //Services (news or entertainment) where the information is fixed and does not update
			put("2.7.1.2", "Dynamic informational"); //Services where the information is dynamic and updates regularly from the broadcast stream
			put("2.7.1.3", "Viewing chats"); //The show displays chats taking place over local and remote systems
			put("2.7.1.4", "Quiz - Basic multiple choice"); //Using any key number, ft, or arrows etc
			put("2.7.1.5", "Quiz - Text or number entry answers"); //Entering real text or numbers into a format
			put("2.7.1.6", "Re-ordering"); //Competitions based on moving lists into correct orders
			put("2.7.1.7", "Positional"); //Challenges or games such as "Spot the Ball", clicking on quess where something is
			put("2.7.1.8", "Sync quiz"); //Synchronized with audio and/or video (the programme)
			put("2.7.1.9", "Timer quiz"); //Quiz synchronized with audio and/or video
			put("2.7.1.10", "Elimination and timer"); //Against the clock
			put("2.7.1.11", "Categories"); //Selecting from batches of questions
			put("2.7.1.12", "Level based quiz/game"); //Cannot move on without completing last level - Difficulty or linear challenge
			put("2.7.1.13", "Following a sequence"); //Temporal, Simon says, red next then green etc
			put("2.7.1.14", "Local multi player"); //Players using the same box in the same space
			put("2.7.1.15", "Multi stream audio-video"); //Services where the interaction is based mostly around alternate, parallel streamed audio or video access
			put("2.7.1.16", "Enhanced advertisement"); //Local interaction, more information locally etc
			put("2.7.1.17", "Logic based games");
			put("2.7.1.18", "Word games");
			put("2.7.1.19", "Positional games");
			put("2.7.1.20", "Board games");
			put("2.7.1.21", "Text based gaming");
			put("2.7.1.22", "Dynamic 2D/3D graphics");
			put("2.7.2", "INTERMITTENT RESPONSE"); //Formats that require an intermittent or continuous return path
			put("2.7.2.1", "Single impulse vote"); //aka "clap-o-meter" - mass aggregation of single hit "press red now if you think this" type votes
			put("2.7.2.2", "Impulse vote from choices"); //Vote from range of items - favourite act, band etc
			put("2.7.2.3", "Impulse Yes/No vote"); //Impulse vote from two choices yes/no
			put("2.7.2.4", "Impulse vote with a value"); //Vote for something to happen with a value attached - e.g. how many tins of baked beans should he eat
			put("2.7.2.5", "Submit answers/form"); //Press now to send off answers or details - quiz or competition
			put("2.7.2.6", "SMS using mobile"); //Sending text from mobile into iTV or web platforms
			put("2.7.2.7", "SMS using TV remote"); //Entry of messages using TV number/letter keys
			put("2.7.2.8", "Impulse gambling"); //Using intermittent persistently protected connection to place real or fantasy bets
			put("2.7.2.9", "Impulse transaction"); //Using intermittent persistently protected connection to buy product - T or ECommerce
			put("2.7.2.10", "Multi player TS networked services/games"); //Multi point networking in either time-shifted mode
			put("2.7.2.11", "Interactive advertisement"); //Local interaction, request for more info, details even link to impulse transaction etc
			put("2.7.3", "ALWAYS ON CONNECTION"); //Formats that ideally require a continuous connection to be delivered
			put("2.7.3.1", "Chat Forum"); //Using built in platform functionality
			put("2.7.3.2", "Chat Forum via web"); //STB with other infrastructure layer e.g. web chat engine in web browser on top of proprietary api
			put("2.7.3.3", "Threaded mail discussions"); //Listed as discussion threads such as usenet type
			put("2.7.3.4", "Point to point"); //Show enables/includes one to one mailing
			put("2.7.3.5", "3rd party point to point"); //Using 3rd party peer to peer (one to one) chat facility layered over the show
			put("2.7.3.6", "Voice chat using mic capability"); //Speech to text engine enabling chat/mailing using IP for example
			put("2.7.3.7", "Dual player networked services/games"); //One to one, peer networking
			put("2.7.3.8", "Multi player RT networked services/games"); //Multi point networking in real time
			put("2.7.3.9", "Gambling services"); //Using continuous persistently protected connection
			put("2.7.3.10", "Impulse transaction"); //Using intermittent persistently protected connection to buy product - T or ECommerce
			put("2.7.3.11", "Non-linear audio-video"); //Services where the interaction is based mostly around choosing alternate audio or video files - VOD and AOD, maybe combined with 2.1.1.15 (multi stream)
		}
	};
}