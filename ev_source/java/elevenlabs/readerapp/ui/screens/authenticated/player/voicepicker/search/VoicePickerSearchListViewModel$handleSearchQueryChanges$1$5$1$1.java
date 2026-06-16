package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.z;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$handleSearchQueryChanges$1$5$1$1", f = "VoicePickerSearchListViewModel.kt", l = {184}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerSearchListViewModel$handleSearchQueryChanges$1$5$1$1 extends i implements p {
    final /* synthetic */ String $resultQuery;
    int label;
    final /* synthetic */ VoicePickerSearchListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSearchListViewModel$handleSearchQueryChanges$1$5$1$1(VoicePickerSearchListViewModel voicePickerSearchListViewModel, String str, wn.c<? super VoicePickerSearchListViewModel$handleSearchQueryChanges$1$5$1$1> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerSearchListViewModel;
        this.$resultQuery = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerSearchListViewModel$handleSearchQueryChanges$1$5$1$1(this.this$0, this.$resultQuery, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerSearchListViewModel$handleSearchQueryChanges$1$5$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object loadVoices;
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
            VoicePickerSearchListViewModel voicePickerSearchListViewModel = this.this$0;
            String str = this.$resultQuery;
            this.label = 1;
            loadVoices = voicePickerSearchListViewModel.loadVoices(0, str, true, this);
            xn.a aVar = xn.a.f37986a;
            if (loadVoices == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
