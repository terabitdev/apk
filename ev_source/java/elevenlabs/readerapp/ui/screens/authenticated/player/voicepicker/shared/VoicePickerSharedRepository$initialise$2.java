package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import io.elevenlabs.domain.services.FeatureFlagService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$initialise$2;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$initialise$2", f = "VoicePickerSharedRepository.kt", l = {318}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerSharedRepository$initialise$2 extends yn.i implements p {
    int label;
    final /* synthetic */ VoicePickerSharedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSharedRepository$initialise$2(VoicePickerSharedRepository voicePickerSharedRepository, wn.c<? super VoicePickerSharedRepository$initialise$2> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerSharedRepository;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerSharedRepository$initialise$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerSharedRepository$initialise$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        FeatureFlagService featureFlagService;
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
            featureFlagService = this.this$0.featureFlagService;
            ir.i isFlagEnabled$default = FeatureFlagService.isFlagEnabled$default(featureFlagService, FeatureFlagService.Flag.VOICE_CHANGER_ENABLED, false, false, 6, null);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            Object collect = isFlagEnabled$default.collect(anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$initialise$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ VoicePickerSharedRepository this$0;

        public AnonymousClass1(VoicePickerSharedRepository voicePickerSharedRepository) {
            this.this$0 = voicePickerSharedRepository;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VoicePickerSharedContract.State emit$lambda$0(boolean z6, VoicePickerSharedContract.State state) {
            state.getClass();
            return VoicePickerSharedContract.State.copy$default(state, null, null, null, null, null, false, null, false, null, null, null, null, z6, 4095, null);
        }

        public final Object emit(final boolean z6, wn.c<? super z> cVar) {
            this.this$0.updateState(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.g
                @Override // ho.l
                public final Object invoke(Object obj) {
                    VoicePickerSharedContract.State emit$lambda$0;
                    emit$lambda$0 = VoicePickerSharedRepository$initialise$2.AnonymousClass1.emit$lambda$0(z6, (VoicePickerSharedContract.State) obj);
                    return emit$lambda$0;
                }
            });
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit(((Boolean) obj).booleanValue(), (wn.c<? super z>) cVar);
        }
    }
}
