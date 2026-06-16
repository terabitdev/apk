package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListContract;
import kotlin.Metadata;
import sn.z;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreenUI$1$1", f = "VoicePickerFilteredListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreenUI$1$1 extends yn.i implements p {
    final /* synthetic */ s2 $hasReachedEnd$delegate;
    final /* synthetic */ l $onEvent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreenUI$1$1(l lVar, s2 s2Var, wn.c<? super VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreenUI$1$1> cVar) {
        super(2, cVar);
        this.$onEvent = lVar;
        this.$hasReachedEnd$delegate = s2Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreenUI$1$1(this.$onEvent, this.$hasReachedEnd$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreenUI$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$1;
        if (this.label == 0) {
            sn.a.g(obj);
            VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$1 = VoicePickerFilteredListScreenKt.VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$1(this.$hasReachedEnd$delegate);
            if (VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$1) {
                this.$onEvent.invoke(VoicePickerFilteredListContract.Event.LoadMore.INSTANCE);
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
