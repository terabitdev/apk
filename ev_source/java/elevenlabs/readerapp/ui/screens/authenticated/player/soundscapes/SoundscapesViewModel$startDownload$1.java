package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Soundscape;
import io.elevenlabs.domain.services.SoundscapeDownloadState;
import io.elevenlabs.domain.services.SoundscapesService;
import kotlin.Metadata;
import sn.z;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel$startDownload$1", f = "SoundscapesViewModel.kt", l = {135}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SoundscapesViewModel$startDownload$1 extends yn.i implements p {
    final /* synthetic */ Soundscape $soundscape;
    int label;
    final /* synthetic */ SoundscapesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundscapesViewModel$startDownload$1(SoundscapesViewModel soundscapesViewModel, Soundscape soundscape, wn.c<? super SoundscapesViewModel$startDownload$1> cVar) {
        super(2, cVar);
        this.this$0 = soundscapesViewModel;
        this.$soundscape = soundscape;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new SoundscapesViewModel$startDownload$1(this.this$0, this.$soundscape, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((SoundscapesViewModel$startDownload$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        SoundscapesService soundscapesService;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            soundscapesService = this.this$0.soundscapesService;
            ir.i downloadSoundscape = soundscapesService.downloadSoundscape(this.$soundscape);
            final SoundscapesViewModel soundscapesViewModel = this.this$0;
            final Soundscape soundscape = this.$soundscape;
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel$startDownload$1.1
                public final Object emit(SoundscapeDownloadState soundscapeDownloadState, wn.c<? super z> cVar) {
                    Logger logger;
                    if (soundscapeDownloadState instanceof SoundscapeDownloadState.Downloading) {
                        SoundscapesViewModel.this.updateDownloadProgress(soundscape.getId(), new Float(ae.l.l(((SoundscapeDownloadState.Downloading) soundscapeDownloadState).getProgress(), u.P, 1.0f)));
                    } else if (soundscapeDownloadState instanceof SoundscapeDownloadState.Completed) {
                        SoundscapesViewModel.this.updateDownloadProgress(soundscape.getId(), null);
                        SoundscapesViewModel.this.startPreview(soundscape, ((SoundscapeDownloadState.Completed) soundscapeDownloadState).getFile());
                    } else if (soundscapeDownloadState instanceof SoundscapeDownloadState.Error) {
                        SoundscapesViewModel.this.updateDownloadProgress(soundscape.getId(), null);
                        logger = SoundscapesViewModel.this.logger;
                        logger.logWarning("SoundscapesViewModel", defpackage.f.k("Download error for soundscape ", soundscape.getId(), ": ", ((SoundscapeDownloadState.Error) soundscapeDownloadState).getMessage()), null);
                    } else {
                        c6.p();
                        return null;
                    }
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((SoundscapeDownloadState) obj2, (wn.c<? super z>) cVar);
                }
            };
            this.label = 1;
            Object collect = downloadSoundscape.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
