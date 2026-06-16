package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import ir.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.a0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel$actualiseVoices$1", f = "VoicePickerCollectionViewModel.kt", l = {96}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerCollectionViewModel$actualiseVoices$1 extends i implements p {
    int label;
    final /* synthetic */ VoicePickerCollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerCollectionViewModel$actualiseVoices$1(VoicePickerCollectionViewModel voicePickerCollectionViewModel, wn.c<? super VoicePickerCollectionViewModel$actualiseVoices$1> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerCollectionViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerCollectionViewModel$actualiseVoices$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerCollectionViewModel$actualiseVoices$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        VoicePickerSharedRepository voicePickerSharedRepository;
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
            voicePickerSharedRepository = this.this$0.sharedRepository;
            ir.i voices = voicePickerSharedRepository.getVoices();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            Object collect = voices.collect(anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel$actualiseVoices$1$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements j {
        final /* synthetic */ VoicePickerCollectionViewModel this$0;

        public AnonymousClass1(VoicePickerCollectionViewModel voicePickerCollectionViewModel) {
            this.this$0 = voicePickerCollectionViewModel;
        }

        public static final VoicePickerCollectionState emit$lambda$0(Map map, VoicePickerCollectionState voicePickerCollectionState) {
            voicePickerCollectionState.getClass();
            if (voicePickerCollectionState instanceof VoicePickerCollectionState.Data) {
                VoicePickerCollectionState.Data data = (VoicePickerCollectionState.Data) voicePickerCollectionState;
                List<Voice> voices = data.getVoices();
                ArrayList arrayList = new ArrayList(tn.p.a0(voices, 10));
                for (Voice voice : voices) {
                    Voice voice2 = (Voice) map.get(voice.getVoiceId());
                    if (voice2 != null) {
                        voice = voice2;
                    }
                    arrayList.add(voice);
                }
                return VoicePickerCollectionState.Data.copy$default(data, null, arrayList, 1, null);
            }
            if (!(voicePickerCollectionState instanceof VoicePickerCollectionState.NotFound) && !(voicePickerCollectionState instanceof VoicePickerCollectionState.Error)) {
                if (voicePickerCollectionState instanceof VoicePickerCollectionState.Loading) {
                    return voicePickerCollectionState;
                }
                c6.p();
                return null;
            }
            return voicePickerCollectionState;
        }

        public final Object emit(List<Voice> list, wn.c<? super z> cVar) {
            int H = a0.H(tn.p.a0(list, 10));
            if (H < 16) {
                H = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(H);
            for (T t10 : list) {
                linkedHashMap.put(((Voice) t10).getVoiceId(), t10);
            }
            this.this$0.queueStateUpdate(new d(linkedHashMap, 0));
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((List<Voice>) obj, (wn.c<? super z>) cVar);
        }
    }
}
