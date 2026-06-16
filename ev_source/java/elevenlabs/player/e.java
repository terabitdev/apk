package io.elevenlabs.player;

import android.content.Intent;
import ho.l;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BackgroundPlayerService f14335b;

    public /* synthetic */ e(BackgroundPlayerService backgroundPlayerService, int i10) {
        this.f14334a = i10;
        this.f14335b = backgroundPlayerService;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f14334a) {
            case 0:
                return BackgroundPlayerService$triggerAssistantFromMediaButton$1.h(this.f14335b, (Intent) obj);
            default:
                return BackgroundPlayerService.f(this.f14335b, ((Long) obj).longValue());
        }
    }
}
