package io.livekit.android.webrtc;

import ho.p;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.org.webrtc.ExternalAudioProcessingFactory;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "value", "<anonymous parameter 1>", "Lsn/z;", "invoke", "(ZZ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CustomAudioProcessingFactory$bypassCapturePostProcessing$2 extends n implements p {
    final /* synthetic */ CustomAudioProcessingFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAudioProcessingFactory$bypassCapturePostProcessing$2(CustomAudioProcessingFactory customAudioProcessingFactory) {
        super(2);
        this.this$0 = customAudioProcessingFactory;
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        return z.f31622a;
    }

    public final void invoke(boolean z6, boolean z10) {
        ExternalAudioProcessingFactory externalAudioProcessingFactory;
        externalAudioProcessingFactory = this.this$0.externalAudioProcessor;
        externalAudioProcessingFactory.setBypassFlagForCapturePost(z6);
    }
}
