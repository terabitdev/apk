package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListContract;
import kotlin.Metadata;
import sn.z;
import u2.s2;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListScreenKt$VoicePickerSearchListScreenUI$1$1", f = "VoicePickerSearchListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerSearchListScreenKt$VoicePickerSearchListScreenUI$1$1 extends i implements p {
    final /* synthetic */ s2 $hasReachedEnd$delegate;
    final /* synthetic */ l $onEvent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSearchListScreenKt$VoicePickerSearchListScreenUI$1$1(l lVar, s2 s2Var, wn.c<? super VoicePickerSearchListScreenKt$VoicePickerSearchListScreenUI$1$1> cVar) {
        super(2, cVar);
        this.$onEvent = lVar;
        this.$hasReachedEnd$delegate = s2Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerSearchListScreenKt$VoicePickerSearchListScreenUI$1$1(this.$onEvent, this.$hasReachedEnd$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerSearchListScreenKt$VoicePickerSearchListScreenUI$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean VoicePickerSearchListScreenUI_Q1bl1hc$lambda$1;
        if (this.label == 0) {
            sn.a.g(obj);
            VoicePickerSearchListScreenUI_Q1bl1hc$lambda$1 = VoicePickerSearchListScreenKt.VoicePickerSearchListScreenUI_Q1bl1hc$lambda$1(this.$hasReachedEnd$delegate);
            if (VoicePickerSearchListScreenUI_Q1bl1hc$lambda$1) {
                this.$onEvent.invoke(VoicePickerSearchListContract.Event.LoadMore.INSTANCE);
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
