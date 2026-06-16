package io.elevenlabs.player;

import ho.p;
import w7.r0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14327a;

    public /* synthetic */ c(int i10) {
        this.f14327a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        String invokeSuspend$lambda$0;
        switch (this.f14327a) {
            case 0:
                return Boolean.valueOf(BackgroundPlayerService$observeMediaItemChanges$1.d((r0) obj, (r0) obj2));
            default:
                invokeSuspend$lambda$0 = BackgroundPlayerService$triggerAssistantFromMediaButton$1.invokeSuspend$lambda$0((String) obj, ((Boolean) obj2).booleanValue());
                return invokeSuspend$lambda$0;
        }
    }
}
