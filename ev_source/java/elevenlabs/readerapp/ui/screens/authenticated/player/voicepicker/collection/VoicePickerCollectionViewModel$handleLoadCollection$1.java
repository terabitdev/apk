package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.VoiceCollectionWithVoices;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionState;
import ir.j;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel$handleLoadCollection$1", f = "VoicePickerCollectionViewModel.kt", l = {60}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerCollectionViewModel$handleLoadCollection$1 extends i implements p {
    int label;
    final /* synthetic */ VoicePickerCollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerCollectionViewModel$handleLoadCollection$1(VoicePickerCollectionViewModel voicePickerCollectionViewModel, wn.c<? super VoicePickerCollectionViewModel$handleLoadCollection$1> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerCollectionViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerCollectionViewModel$handleLoadCollection$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerCollectionViewModel$handleLoadCollection$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ir.i observeCollection;
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
            observeCollection = this.this$0.observeCollection();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            Object collect = observeCollection.collect(anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel$handleLoadCollection$1$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements j {
        final /* synthetic */ VoicePickerCollectionViewModel this$0;

        public AnonymousClass1(VoicePickerCollectionViewModel voicePickerCollectionViewModel) {
            this.this$0 = voicePickerCollectionViewModel;
        }

        public static final VoicePickerCollectionState emit$lambda$0(VoicePickerCollectionState voicePickerCollectionState) {
            voicePickerCollectionState.getClass();
            return VoicePickerCollectionState.Error.INSTANCE;
        }

        public static final VoicePickerCollectionState emit$lambda$1(VoiceCollectionWithVoices voiceCollectionWithVoices, VoicePickerCollectionState voicePickerCollectionState) {
            voicePickerCollectionState.getClass();
            return new VoicePickerCollectionState.Data(voiceCollectionWithVoices.getVoiceCollection(), voiceCollectionWithVoices.getVoices());
        }

        public static final VoicePickerCollectionState emit$lambda$2(VoicePickerCollectionState voicePickerCollectionState) {
            voicePickerCollectionState.getClass();
            return VoicePickerCollectionState.NotFound.INSTANCE;
        }

        public final Object emit(AsyncCallResult<VoiceCollectionWithVoices> asyncCallResult, wn.c<? super z> cVar) {
            Logger logger;
            if (asyncCallResult instanceof AsyncCallResult.Error) {
                logger = this.this$0.logger;
                logger.log("VoicePickerCollectionVM", "Failed to load collection: " + asyncCallResult);
                this.this$0.queueStateUpdate(new e(0));
            } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                VoiceCollectionWithVoices voiceCollectionWithVoices = (VoiceCollectionWithVoices) ((AsyncCallResult.Success) asyncCallResult).getData();
                VoicePickerCollectionViewModel voicePickerCollectionViewModel = this.this$0;
                if (voiceCollectionWithVoices != null) {
                    voicePickerCollectionViewModel.queueStateUpdate(new d(voiceCollectionWithVoices, 1));
                } else {
                    voicePickerCollectionViewModel.queueStateUpdate(new e(1));
                }
            } else {
                c6.p();
                return null;
            }
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((AsyncCallResult<VoiceCollectionWithVoices>) obj, (wn.c<? super z>) cVar);
        }
    }
}
