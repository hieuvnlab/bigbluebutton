/**
* BigBlueButton open source conferencing system - http://www.bigbluebutton.org/
* 
* Copyright (c) 2015 BigBlueButton Inc. and by respective authors (see below).
*
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License as published by the Free Software
* Foundation; either version 3.0 of the License, or (at your option) any later
* version.
* 
* BigBlueButton is distributed in the hope that it will be useful, but WITHOUT ANY
* WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
* PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License along
* with BigBlueButton; if not, see <http://www.gnu.org/licenses/>.
*
*/
package org.bigbluebutton.freeswitch.voice.freeswitch.actions;

import org.bigbluebutton.freeswitch.voice.events.ConferenceEventListener;
import org.freeswitch.esl.client.transport.message.EslMessage;

public class DeskShareRecordCommand extends FreeswitchCommand {

	private String recordPath;
	private boolean record;

	public DeskShareRecordCommand(String room, String requesterId, boolean record, String recordPath){
		super(room, requesterId);
		this.recordPath = recordPath;
		this.record = record;
	}


	@Override
	public String getCommandArgs() {
		String action = "norecord";
		if (record)
			action = "record";

		System.out.println("\n\n\n\n\n DESKSHARE RECORD " + record + "\n\n\n\n");
		return SPACE + getRoom() + SPACE + action + SPACE + recordPath;
	}

	public void handleResponse(EslMessage response, ConferenceEventListener eventListener) {
		//Test for Known Conference
		System.out.println("\n\n\n\n\nLALALALLALA\n\n\n\n");
	}
}
