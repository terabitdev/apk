package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.q;
import io.elevenlabs.domain.services.ExploreVoicesService;
import ir.j;
import ir.r;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel$observeCollection$$inlined$flatMapLatest$1", f = "VoicePickerCollectionViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {TokenNames.R, TokenNames.T, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerCollectionViewModel$observeCollection$$inlined$flatMapLatest$1 extends i implements q {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ VoicePickerCollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerCollectionViewModel$observeCollection$$inlined$flatMapLatest$1(wn.c cVar, VoicePickerCollectionViewModel voicePickerCollectionViewModel) {
        super(3, cVar);
        this.this$0 = voicePickerCollectionViewModel;
    }

    public final Object invoke(j jVar, Boolean bool, wn.c<? super z> cVar) {
        VoicePickerCollectionViewModel$observeCollection$$inlined$flatMapLatest$1 voicePickerCollectionViewModel$observeCollection$$inlined$flatMapLatest$1 = new VoicePickerCollectionViewModel$observeCollection$$inlined$flatMapLatest$1(cVar, this.this$0);
        voicePickerCollectionViewModel$observeCollection$$inlined$flatMapLatest$1.L$0 = jVar;
        voicePickerCollectionViewModel$observeCollection$$inlined$flatMapLatest$1.L$1 = bool;
        return voicePickerCollectionViewModel$observeCollection$$inlined$flatMapLatest$1.invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        VoicePickerCollectionRoute voicePickerCollectionRoute;
        ExploreVoicesService exploreVoicesService;
        VoicePickerCollectionRoute voicePickerCollectionRoute2;
        ir.i observeVoiceCollection;
        ExploreVoicesService exploreVoicesService2;
        VoicePickerCollectionRoute voicePickerCollectionRoute3;
        VoicePickerCollectionRoute voicePickerCollectionRoute4;
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
            j jVar = (j) this.L$0;
            ((Boolean) this.L$1).getClass();
            voicePickerCollectionRoute = this.this$0.route;
            String readId = voicePickerCollectionRoute.getReadId();
            VoicePickerCollectionViewModel voicePickerCollectionViewModel = this.this$0;
            if (readId != null) {
                exploreVoicesService2 = voicePickerCollectionViewModel.service;
                voicePickerCollectionRoute3 = this.this$0.route;
                String collectionId = voicePickerCollectionRoute3.getCollectionId();
                voicePickerCollectionRoute4 = this.this$0.route;
                observeVoiceCollection = exploreVoicesService2.observeVoiceCollection(collectionId, voicePickerCollectionRoute4.getReadId());
            } else {
                exploreVoicesService = voicePickerCollectionViewModel.service;
                voicePickerCollectionRoute2 = this.this$0.route;
                observeVoiceCollection = exploreVoicesService.observeVoiceCollection(voicePickerCollectionRoute2.getCollectionId());
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object r10 = r.r(jVar, observeVoiceCollection, this);
            xn.a aVar = xn.a.f37986a;
            if (r10 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((j) obj, (Boolean) obj2, (wn.c<? super z>) obj3);
    }
}
