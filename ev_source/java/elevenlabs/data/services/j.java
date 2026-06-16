package io.elevenlabs.data.services;

import ho.p;
import io.elevenlabs.data.model.response.EnrichedAudioChunk;
import io.elevenlabs.data.services.WssStreamingSession;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements p {
    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        boolean invokeSuspend$lambda$2;
        invokeSuspend$lambda$2 = WssStreamingSession.AnonymousClass1.invokeSuspend$lambda$2((EnrichedAudioChunk) obj, (EnrichedAudioChunk) obj2);
        return Boolean.valueOf(invokeSuspend$lambda$2);
    }
}
