package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterUtilsKt;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlaybackPosition;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$seekAudioBySeconds$1", f = "PlayerViewModel.kt", l = {1925, 1949}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$seekAudioBySeconds$1 extends yn.i implements ho.p {
    double D$0;
    double D$1;
    double D$2;
    double D$3;
    double D$4;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$seekAudioBySeconds$1(PlayerViewModel playerViewModel, wn.c<? super PlayerViewModel$seekAudioBySeconds$1> cVar) {
        super(2, cVar);
        this.this$0 = playerViewModel;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerViewModel$seekAudioBySeconds$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$seekAudioBySeconds$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x002f, code lost:
    
        if (fr.g0.m(150, r23) == r5) goto L43;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PlaybackPosition playbackPosition;
        PlaybackPosition.AudioOnly audioOnly;
        int i10;
        ReadMeta readMeta;
        List<Chapter> chapters;
        double d10;
        Object seekToCumulativePosition;
        double d11;
        int i11 = this.label;
        sn.z zVar = sn.z.f31622a;
        xn.a aVar = xn.a.f37986a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    sn.a.g(obj);
                    return zVar;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            this.label = 1;
        }
        ContentState contentState = ((PlayerState) this.this$0.getStateFlow().getValue()).getContentState();
        if (contentState != null) {
            playbackPosition = contentState.getPosition();
        } else {
            playbackPosition = null;
        }
        if (playbackPosition instanceof PlaybackPosition.AudioOnly) {
            audioOnly = (PlaybackPosition.AudioOnly) playbackPosition;
        } else {
            audioOnly = null;
        }
        if (audioOnly != null) {
            double seconds = audioOnly.getSeconds();
            ContentState contentState2 = ((PlayerState) this.this$0.getStateFlow().getValue()).getContentState();
            if (contentState2 != null) {
                i10 = PlayerStateKt.calculateCurrentChapterIndex(contentState2);
            } else {
                i10 = 0;
            }
            ContentState contentState3 = ((PlayerState) this.this$0.getStateFlow().getValue()).getContentState();
            if (contentState3 != null && (readMeta = contentState3.getReadMeta()) != null && (chapters = readMeta.getChapters()) != null) {
                double cumulativeChapterDuration = ChapterUtilsKt.getCumulativeChapterDuration(chapters, i10);
                double d12 = cumulativeChapterDuration + seconds;
                Iterator<T> it = chapters.iterator();
                double d13 = 0.0d;
                while (it.hasNext()) {
                    Double durationSeconds = ((Chapter) it.next()).getDurationSeconds();
                    if (durationSeconds != null) {
                        d11 = durationSeconds.doubleValue();
                    } else {
                        d11 = 0.0d;
                    }
                    d13 += d11;
                }
                d10 = this.this$0.pendingSeekOffset;
                double k4 = ae.l.k(d10 + d12, 0.0d, d13);
                this.this$0.pendingSeekOffset = 0.0d;
                PlayerViewModel playerViewModel = this.this$0;
                this.L$0 = null;
                this.D$0 = seconds;
                this.I$0 = i10;
                this.D$1 = cumulativeChapterDuration;
                this.D$2 = d12;
                this.D$3 = d13;
                this.D$4 = k4;
                this.label = 2;
                seekToCumulativePosition = playerViewModel.seekToCumulativePosition(k4, this);
                if (seekToCumulativePosition == aVar) {
                    return aVar;
                }
            }
        }
        return zVar;
    }
}
