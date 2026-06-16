package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import io.elevenlabs.domain.model.Soundscape;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16339a;

    public /* synthetic */ l(int i10) {
        this.f16339a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z lambda__531919108$lambda$0$0$0;
        z lambda__1918080440$lambda$0$0$0;
        z lambda__1572457102$lambda$0$0$0;
        z lambda__1350132463$lambda$0$1$0;
        Object SoundscapeList$lambda$0$2$0$2;
        SoundscapesContract.State onRetry$lambda$0;
        switch (this.f16339a) {
            case 0:
                return SoundscapesViewModel$initialize$1.d((SoundscapesContract.State) obj);
            case 1:
                lambda__531919108$lambda$0$0$0 = ComposableSingletons$SoundscapesScreenKt.lambda__531919108$lambda$0$0$0((SoundscapesContract.Event) obj);
                return lambda__531919108$lambda$0$0$0;
            case 2:
                lambda__1918080440$lambda$0$0$0 = ComposableSingletons$SoundscapesScreenKt.lambda__1918080440$lambda$0$0$0((SoundscapesContract.Event) obj);
                return lambda__1918080440$lambda$0$0$0;
            case 3:
                lambda__1572457102$lambda$0$0$0 = ComposableSingletons$SoundscapesScreenKt.lambda__1572457102$lambda$0$0$0((SoundscapesContract.Event) obj);
                return lambda__1572457102$lambda$0$0$0;
            case 4:
                lambda__1350132463$lambda$0$1$0 = ComposableSingletons$SoundscapesScreenKt.lambda__1350132463$lambda$0$1$0((SoundscapesContract.Event) obj);
                return lambda__1350132463$lambda$0$1$0;
            case 5:
                SoundscapeList$lambda$0$2$0$2 = SoundscapesScreenKt.SoundscapeList$lambda$0$2$0$2((Soundscape) obj);
                return SoundscapeList$lambda$0$2$0$2;
            default:
                onRetry$lambda$0 = SoundscapesViewModel.onRetry$lambda$0((SoundscapesContract.State) obj);
                return onRetry$lambda$0;
        }
    }
}
