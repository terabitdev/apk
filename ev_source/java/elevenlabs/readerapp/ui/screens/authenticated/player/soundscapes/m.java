package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Soundscape;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16341b;

    public /* synthetic */ m(Object obj, int i10) {
        this.f16340a = i10;
        this.f16341b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        SoundscapesContract.State invokeSuspend$lambda$1;
        SoundscapesContract.State invokeSuspend$lambda$2;
        SoundscapesContract.State selectTab$lambda$0;
        SoundscapesContract.State selectSoundscape$lambda$0;
        switch (this.f16340a) {
            case 0:
                invokeSuspend$lambda$1 = SoundscapesViewModel$initialize$1.invokeSuspend$lambda$1((AsyncCallResult.Error) this.f16341b, (SoundscapesContract.State) obj);
                return invokeSuspend$lambda$1;
            case 1:
                invokeSuspend$lambda$2 = SoundscapesViewModel$initialize$1.invokeSuspend$lambda$2((List) this.f16341b, (SoundscapesContract.State) obj);
                return invokeSuspend$lambda$2;
            case 2:
                selectTab$lambda$0 = SoundscapesViewModel.selectTab$lambda$0((SoundscapeCategory) this.f16341b, (SoundscapesContract.State) obj);
                return selectTab$lambda$0;
            default:
                selectSoundscape$lambda$0 = SoundscapesViewModel.selectSoundscape$lambda$0((Soundscape) this.f16341b, (SoundscapesContract.State) obj);
                return selectSoundscape$lambda$0;
        }
    }
}
