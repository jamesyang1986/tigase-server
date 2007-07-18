/*
 * Tigase Jabber/XMPP Server
 * Copyright (C) 2004-2007 "Artur Hefczyc" <artur.hefczyc@tigase.org>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. Look for COPYING file in the top folder.
 * If not, see http://www.gnu.org/licenses/.
 *
 * $Rev$
 * Last modified by $Author$
 * $Date$
 */
package tigase.util;

import tigase.xml.Element;
import tigase.xmpp.StanzaType;

/**
 * Describe class ElementUtils here.
 *
 *
 * Created: Sat Mar 25 20:08:17 2006
 *
 * @author <a href="mailto:artur.hefczyc@tigase.org">Artur Hefczyc</a>
 * @version $Rev$
 */
public class ElementUtils {

	public static Element createIqQuery(final String from, final String to,
		final StanzaType type, final String id, final String xmlns) {
		Element iq = new Element("iq",
			new String[] {"from", "to", "type", "id"},
			new String[] {from, to, type.toString(), id});
		Element query = new Element("query");
		query.setXMLNS(xmlns);
		iq.addChild(query);
		return iq;
	}

	public static Element createIqQuery(final String from, final String to,
		final StanzaType type, final String id, final Element query) {
		Element iq = new Element("iq",
			new String[] {"from", "to", "type", "id"},
			new String[] {from, to, type.toString(), id});
		iq.addChild(query);
		return iq;
	}

} // ElementUtils