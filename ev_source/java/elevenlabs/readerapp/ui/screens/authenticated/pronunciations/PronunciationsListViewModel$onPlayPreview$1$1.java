package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.PlayPronunciationPreviewUseCase;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListViewModel$onPlayPreview$1$1", f = "PronunciationsListScreen.kt", l = {178, 179}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PronunciationsListViewModel$onPlayPreview$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $previewPlayingPronunciationId;
    final /* synthetic */ PronunciationPreviewState $previewState;
    final /* synthetic */ Pronunciation $pronunciation;
    Object L$0;
    int label;
    final /* synthetic */ PronunciationsListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PronunciationsListViewModel$onPlayPreview$1$1(PronunciationsListViewModel pronunciationsListViewModel, Pronunciation pronunciation, PronunciationPreviewState pronunciationPreviewState, String str, wn.c<? super PronunciationsListViewModel$onPlayPreview$1$1> cVar) {
        super(2, cVar);
        this.this$0 = pronunciationsListViewModel;
        this.$pronunciation = pronunciation;
        this.$previewState = pronunciationPreviewState;
        this.$previewPlayingPronunciationId = str;
    }

    public static final z invokeSuspend$lambda$0(PronunciationsListViewModel pronunciationsListViewModel, Pronunciation pronunciation, PronunciationPreviewState pronunciationPreviewState) {
        pronunciationsListViewModel.queueStateUpdate(new q(pronunciationPreviewState, pronunciation, 1));
        return z.f31622a;
    }

    public static final PronunciationsListState invokeSuspend$lambda$0$0(PronunciationPreviewState pronunciationPreviewState, Pronunciation pronunciation, PronunciationsListState pronunciationsListState) {
        String id2;
        if (pronunciationPreviewState == PronunciationPreviewState.Stopped) {
            id2 = null;
        } else {
            id2 = pronunciation.getId();
        }
        return PronunciationsListState.copy$default(pronunciationsListState, null, false, null, pronunciationPreviewState, id2, 7, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new PronunciationsListViewModel$onPlayPreview$1$1(this.this$0, this.$pronunciation, this.$previewState, this.$previewPlayingPronunciationId, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((PronunciationsListViewModel$onPlayPreview$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        if (r4.invoke(r5, r6, r7, r8, r9, r11) == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r12 == r3) goto L33;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        VoicesService voicesService;
        PlayPronunciationPreviewUseCase playPronunciationPreviewUseCase;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            voicesService = this.this$0.voicesService;
            ir.i defaultVoiceId = voicesService.defaultVoiceId();
            this.label = 1;
            obj = ir.r.u(defaultVoiceId, this);
        }
        String str = (String) obj;
        playPronunciationPreviewUseCase = this.this$0.playPronunciationPreviewUseCase;
        String spokenText = this.$pronunciation.getSpokenText();
        PronunciationPreviewState pronunciationPreviewState = this.$previewState;
        PronunciationsListViewModel pronunciationsListViewModel = this.this$0;
        Pronunciation pronunciation = this.$pronunciation;
        r rVar = new r(pronunciationsListViewModel, pronunciation, 0);
        boolean z6 = !kotlin.jvm.internal.m.c(this.$previewPlayingPronunciationId, pronunciation.getId());
        this.L$0 = null;
        this.label = 2;
    }
}
