package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import ho.l;
import ho.p;
import i3.t;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt;
import io.elevenlabs.ui.components.BlurBackgroundKt;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f16280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16281c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16284f;

    public /* synthetic */ b(String str, t tVar, float f10, int i10, int i11) {
        this.f16279a = 2;
        this.f16283e = str;
        this.f16284f = tVar;
        this.f16280b = f10;
        this.f16281c = i10;
        this.f16282d = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z PlayerQueueScreen_Kz89ssw$lambda$5;
        z VolumeControl$lambda$1;
        switch (this.f16279a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PlayerQueueScreen_Kz89ssw$lambda$5 = PlayerQueueScreenKt.PlayerQueueScreen_Kz89ssw$lambda$5(this.f16280b, (MediaItemState) this.f16283e, (PlayerQueueViewModel) this.f16284f, this.f16281c, this.f16282d, (m) obj, intValue);
                return PlayerQueueScreen_Kz89ssw$lambda$5;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                VolumeControl$lambda$1 = SoundscapesScreenKt.VolumeControl$lambda$1(this.f16280b, (l) this.f16283e, (t) this.f16284f, this.f16281c, this.f16282d, (m) obj, intValue2);
                return VolumeControl$lambda$1;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                return BlurBackgroundKt.a((String) this.f16283e, (t) this.f16284f, this.f16280b, this.f16281c, this.f16282d, (m) obj, intValue3);
        }
    }

    public /* synthetic */ b(float f10, Object obj, Object obj2, int i10, int i11, int i12) {
        this.f16279a = i12;
        this.f16280b = f10;
        this.f16283e = obj;
        this.f16284f = obj2;
        this.f16281c = i10;
        this.f16282d = i11;
    }
}
