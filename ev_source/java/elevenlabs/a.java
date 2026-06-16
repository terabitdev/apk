package io.elevenlabs;

import ho.l;
import io.elevenlabs.models.ConversationEvent;
import io.elevenlabs.network.ConnectionState;
import io.elevenlabs.network.OutgoingEvent;
import java.util.Map;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationSessionImpl f13991b;

    public /* synthetic */ a(ConversationSessionImpl conversationSessionImpl, int i10) {
        this.f13990a = i10;
        this.f13991b = conversationSessionImpl;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z start$lambda$13;
        z eventHandler$lambda$3;
        z eventHandler$lambda$4;
        z eventHandler$lambda$5;
        z eventHandler$lambda$6;
        z eventHandler$lambda$7;
        z start$lambda$14;
        z eventHandler$lambda$0;
        z eventHandler$lambda$11;
        z eventHandler$lambda$1;
        z eventHandler$lambda$2;
        switch (this.f13990a) {
            case 0:
                start$lambda$13 = ConversationSessionImpl.start$lambda$13(this.f13991b, (String) obj);
                return start$lambda$13;
            case 1:
                eventHandler$lambda$3 = ConversationSessionImpl.eventHandler$lambda$3(this.f13991b, ((Float) obj).floatValue());
                return eventHandler$lambda$3;
            case 2:
                eventHandler$lambda$4 = ConversationSessionImpl.eventHandler$lambda$4(this.f13991b, (Map) obj);
                return eventHandler$lambda$4;
            case 3:
                eventHandler$lambda$5 = ConversationSessionImpl.eventHandler$lambda$5(this.f13991b, (Map) obj);
                return eventHandler$lambda$5;
            case 4:
                eventHandler$lambda$6 = ConversationSessionImpl.eventHandler$lambda$6(this.f13991b, (String) obj);
                return eventHandler$lambda$6;
            case 5:
                eventHandler$lambda$7 = ConversationSessionImpl.eventHandler$lambda$7(this.f13991b, (String) obj);
                return eventHandler$lambda$7;
            case 6:
                start$lambda$14 = ConversationSessionImpl.start$lambda$14(this.f13991b, (ConnectionState) obj);
                return start$lambda$14;
            case 7:
                eventHandler$lambda$0 = ConversationSessionImpl.eventHandler$lambda$0(this.f13991b, (OutgoingEvent) obj);
                return eventHandler$lambda$0;
            case 8:
                eventHandler$lambda$11 = ConversationSessionImpl.eventHandler$lambda$11(this.f13991b, ((Integer) obj).intValue());
                return eventHandler$lambda$11;
            case 9:
                eventHandler$lambda$1 = ConversationSessionImpl.eventHandler$lambda$1(this.f13991b, ((Boolean) obj).booleanValue());
                return eventHandler$lambda$1;
            default:
                eventHandler$lambda$2 = ConversationSessionImpl.eventHandler$lambda$2(this.f13991b, (ConversationEvent.ClientToolCall) obj);
                return eventHandler$lambda$2;
        }
    }
}
