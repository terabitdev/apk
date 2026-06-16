package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$initialise$3;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$initialise$3", f = "VoicePickerSharedRepository.kt", l = {326}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerSharedRepository$initialise$3 extends yn.i implements p {
    final /* synthetic */ VoicePickerMode $mode;
    int label;
    final /* synthetic */ VoicePickerSharedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSharedRepository$initialise$3(VoicePickerSharedRepository voicePickerSharedRepository, VoicePickerMode voicePickerMode, wn.c<? super VoicePickerSharedRepository$initialise$3> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerSharedRepository;
        this.$mode = voicePickerMode;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerSharedRepository$initialise$3(this.this$0, this.$mode, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerSharedRepository$initialise$3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ir.i observeInitData;
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
            observeInitData = this.this$0.observeInitData(((VoicePickerMode.VoicePicker) this.$mode).getReadId());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            Object collect = observeInitData.collect(anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository$initialise$3$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ VoicePickerSharedRepository this$0;

        public AnonymousClass1(VoicePickerSharedRepository voicePickerSharedRepository) {
            this.this$0 = voicePickerSharedRepository;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VoicePickerSharedContract.State emit$lambda$1(ReadMeta readMeta, String str, VoicePickerSharedContract.State state) {
            VoicePickerSharedContract.ReadMetaState readMetaState;
            String str2;
            state.getClass();
            if (readMeta != null) {
                readMetaState = new VoicePickerSharedContract.ReadMetaState.Present(readMeta);
            } else {
                readMetaState = VoicePickerSharedContract.ReadMetaState.Absent.INSTANCE;
            }
            VoicePickerSharedContract.ReadMetaState readMetaState2 = readMetaState;
            String selectedVoiceId = state.getSelectedVoiceId();
            if (selectedVoiceId == null) {
                str2 = str;
            } else {
                str2 = selectedVoiceId;
            }
            return VoicePickerSharedContract.State.copy$default(state, null, readMetaState2, str, str2, null, false, null, false, null, null, null, null, false, 8177, null);
        }

        public final Object emit(k kVar, wn.c<? super z> cVar) {
            String resolveLastUsedVoiceId;
            final ReadMeta readMeta = (ReadMeta) kVar.f31600a;
            final String str = (String) kVar.f31601b;
            if (readMeta != null && (resolveLastUsedVoiceId = EffectivePlaybackModeKt.resolveLastUsedVoiceId(readMeta, str)) != null) {
                str = resolveLastUsedVoiceId;
            }
            this.this$0.updateState(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.h
                @Override // ho.l
                public final Object invoke(Object obj) {
                    VoicePickerSharedContract.State emit$lambda$1;
                    emit$lambda$1 = VoicePickerSharedRepository$initialise$3.AnonymousClass1.emit$lambda$1(ReadMeta.this, str, (VoicePickerSharedContract.State) obj);
                    return emit$lambda$1;
                }
            });
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((k) obj, (wn.c<? super z>) cVar);
        }
    }
}
