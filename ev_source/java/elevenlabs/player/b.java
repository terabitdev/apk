package io.elevenlabs.player;

import ho.l;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ReadMeta;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14326b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f14325a = i10;
        this.f14326b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        long d10;
        switch (this.f14325a) {
            case 0:
                d10 = BackgroundPlayerService$navigateChapter$2.d((Chapter) this.f14326b, (ReadMeta) obj);
                break;
            case 1:
                d10 = BackgroundPlayerService.handlePlaybackEnded$lambda$1((Chapter) this.f14326b, (ReadMeta) obj);
                break;
            default:
                d10 = BackgroundPlayerService$createMediaSessionCallback$1.a((Long) this.f14326b, (ReadMeta) obj);
                break;
        }
        return Long.valueOf(d10);
    }
}
