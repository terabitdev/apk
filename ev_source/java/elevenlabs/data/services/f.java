package io.elevenlabs.data.services;

import android.os.Vibrator;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14122b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f14121a = i10;
        this.f14122b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        Vibrator vibrator_delegate$lambda$0;
        switch (this.f14121a) {
            case 0:
                return OfflineChunkFlowFactory$createChunkFlow$1.d((ChunkWithAlignmentPosition) this.f14122b);
            case 1:
                vibrator_delegate$lambda$0 = AndroidVibrationService.vibrator_delegate$lambda$0((AndroidVibrationService) this.f14122b);
                return vibrator_delegate$lambda$0;
            case 2:
                return NotificationServiceImpl.a((String) this.f14122b);
            default:
                return SoundscapeDownloader.a((SoundscapeDownloader) this.f14122b);
        }
    }
}
