package org.gsc.net.gsc;

import org.gsc.net.message.gsc.GscMessage;
import org.gsc.net.message.p2p.ReasonCode;

public interface Gsc {
  void active();

  void dropConnect();

  void sendMessage(GscMessage msg);

  void disconnect(ReasonCode reason);
}
