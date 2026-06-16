package io.elevenlabs.readerapp.ui.previews;

import ig.f;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCategory;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, d2 = {"stubVoicesList", "", "Lio/elevenlabs/domain/model/Voice;", "stubVoice", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoicesFactoryKt {
    public static final Voice stubVoice() {
        return new Voice(null, "dfgdfhgdfj2", "James Dean", "James Dean became the blueprint for “cool” and the distinction of his look and voice in media is a testament to his everlasting legacy in American popular culture.", "Academy Award Nominee", "Academy Award Nominee", "American", "Male", "Middle Aged American Male", "Iconic Voice", true, "https://preview", null, VoiceCategory.User, null, null, PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, null);
    }

    public static final List<Voice> stubVoicesList() {
        VoiceCategory voiceCategory = VoiceCategory.Premade;
        return f.I(new Voice(null, "1GCrs945cp4oP7i0cPos", "Chris", "Middle Aged American Male", "subtitle", "middle aged", "American", "Male", "Middle Aged American Male", "Audiobook", false, "https://preview", null, voiceCategory, null, null, PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, null), new Voice(null, "1GCdfgfdgdfg7i0cPos", "Jeremy", "Young American-Irish Male", "subtitle", "middle aged", "American", "Male", "Young American-Irish Male", "Audiobook", false, "https://preview", null, voiceCategory, null, null, PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, null), new Voice(null, "gsfs123fsddfs", "Brian", "Middle Aged American Male", "subtitle", "middle aged", "American", "Male", "Middle Aged American Male", "Audiobook", false, "https://preview", null, voiceCategory, null, null, PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, null), new Voice(null, "dfgdfhgdfj2", "James Dean", "Academy Award Nominee", "subtitle", "Academy Award Nominee", "American", "Male", "Middle Aged American Male", "Iconic Voice", true, "https://preview", null, VoiceCategory.User, null, null, PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, null));
    }
}
