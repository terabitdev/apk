package io.elevenlabs;

import ho.p;
import sn.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationSessionImpl f13999b;

    public /* synthetic */ b(ConversationSessionImpl conversationSessionImpl, int i10) {
        this.f13998a = i10;
        this.f13999b = conversationSessionImpl;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13998a) {
            case 0:
                return ConversationSessionImpl.m(this.f13999b, (String) obj, (String) obj2);
            case 1:
                return ConversationSessionImpl.e(this.f13999b, (m) obj, (String) obj2);
            default:
                return ConversationSessionImpl.l(this.f13999b, ((Integer) obj).intValue(), (String) obj2);
        }
    }
}
