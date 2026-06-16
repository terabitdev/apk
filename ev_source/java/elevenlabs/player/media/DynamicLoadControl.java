package io.elevenlabs.player.media;

import a5.a;
import g8.h;
import g8.p1;
import g8.r0;
import g8.s0;
import h8.w;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.StreamingService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r8.h0;
import r8.t1;
import sn.c;
import u8.q;
import v8.b;
import w7.r1;
import z7.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010!\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0010\u0010 \u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001f0\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0010\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010$\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010&J\u000f\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010'J'\u0010,\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0017¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b,\u0010\u001bJ7\u0010!\u001a\u00020\n2\u000e\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020.0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b!\u00100J?\u0010\u001a\u001a\u00020\u00152\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u0010)\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*2\u0006\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u001a\u00107J/\u0010\u001a\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*2\u0006\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;¨\u0006="}, d2 = {"Lio/elevenlabs/player/media/DynamicLoadControl;", "Lg8/s0;", "Lio/elevenlabs/domain/services/StreamingService;", "streamingService", "Lio/elevenlabs/domain/Logger;", "logger", "Lg8/h;", "delegate", "<init>", "(Lio/elevenlabs/domain/services/StreamingService;Lio/elevenlabs/domain/Logger;Lg8/h;)V", "Lsn/z;", "onPrepared", "()V", "Lh8/w;", "playerId", "(Lh8/w;)V", "onStopped", "onReleased", "", "getBackBufferDurationUs", "(Lh8/w;)J", "", "retainBackBufferFromKeyframe", "(Lh8/w;)Z", "Lg8/r0;", "parameters", "shouldStartPlayback", "(Lg8/r0;)Z", "Lr8/t1;", "trackGroups", "", "Lu8/q;", "trackSelections", "onTracksSelected", "(Lg8/r0;Lr8/t1;[Lu8/q;)V", "Lv8/b;", "getAllocator", "(Lh8/w;)Lv8/b;", "()J", "()Z", "playbackPositionUs", "bufferedDurationUs", "", "playbackSpeed", "shouldContinueLoading", "(JJF)Z", "Lg8/p1;", "renderers", "([Lg8/p1;Lr8/t1;[Lu8/q;)V", "Lw7/r1;", "timeline", "Lr8/h0;", "mediaPeriodId", "rebuffering", "targetLiveOffsetUs", "(Lw7/r1;Lr8/h0;JFZJ)Z", "(JFZJ)Z", "Lio/elevenlabs/domain/services/StreamingService;", "Lio/elevenlabs/domain/Logger;", "Lg8/h;", "Companion", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DynamicLoadControl implements s0 {
    private static final String TAG = "DynamicLoadControl";
    private final h delegate;
    private final Logger logger;
    private final StreamingService streamingService;

    public DynamicLoadControl(StreamingService streamingService, Logger logger, h hVar) {
        streamingService.getClass();
        logger.getClass();
        hVar.getClass();
        this.streamingService = streamingService;
        this.logger = logger;
        this.delegate = hVar;
    }

    @Override // g8.s0
    public b getAllocator(w playerId) {
        playerId.getClass();
        h hVar = this.delegate;
        hVar.getClass();
        return new a(hVar, playerId);
    }

    @c
    public long getBackBufferDurationUs() {
        this.delegate.getClass();
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    @Override // g8.s0
    public void onPrepared(w playerId) {
        playerId.getClass();
        this.delegate.onPrepared(playerId);
        this.logger.log(TAG, "onPrepared");
    }

    @Override // g8.s0
    public void onReleased(w playerId) {
        playerId.getClass();
        this.delegate.onReleased(playerId);
        this.logger.log(TAG, "onReleased");
    }

    @Override // g8.s0
    public void onStopped(w playerId) {
        playerId.getClass();
        this.delegate.c(playerId);
        this.logger.log(TAG, "onStopped");
    }

    @Override // g8.s0
    public void onTracksSelected(r0 parameters, t1 trackGroups, q[] trackSelections) {
        parameters.getClass();
        trackGroups.getClass();
        trackSelections.getClass();
        this.delegate.onTracksSelected(parameters, trackGroups, trackSelections);
        this.logger.log(TAG, "onTracksSelected");
    }

    @c
    public boolean retainBackBufferFromKeyframe() {
        this.delegate.getClass();
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    @Override // g8.s0
    public boolean shouldContinueLoading(r0 parameters) {
        parameters.getClass();
        boolean shouldContinueLoading = this.delegate.shouldContinueLoading(parameters);
        this.streamingService.setLoadingAllowed(shouldContinueLoading);
        return shouldContinueLoading;
    }

    @Override // g8.s0
    public boolean shouldContinuePreloading(w wVar, r1 r1Var, h0 h0Var, long j4) {
        e.n("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @c
    public boolean shouldStartPlayback(r1 timeline, h0 mediaPeriodId, long bufferedDurationUs, float playbackSpeed, boolean rebuffering, long targetLiveOffsetUs) {
        timeline.getClass();
        mediaPeriodId.getClass();
        this.delegate.getClass();
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    @Override // g8.s0
    public long getBackBufferDurationUs(w playerId) {
        playerId.getClass();
        return this.delegate.f10698n;
    }

    @Override // g8.s0
    public boolean retainBackBufferFromKeyframe(w playerId) {
        playerId.getClass();
        this.delegate.getClass();
        return false;
    }

    @c
    public boolean shouldContinueLoading(long playbackPositionUs, long bufferedDurationUs, float playbackSpeed) {
        this.delegate.getClass();
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    @c
    public void onPrepared() {
        this.delegate.getClass();
        throw new IllegalStateException("onPrepared not implemented");
    }

    @c
    public void onReleased() {
        this.delegate.getClass();
        throw new IllegalStateException("onReleased not implemented");
    }

    @c
    public void onStopped() {
        this.delegate.getClass();
        throw new IllegalStateException("onStopped not implemented");
    }

    @Override // g8.s0
    public boolean shouldStartPlayback(r0 parameters) {
        parameters.getClass();
        return this.delegate.shouldStartPlayback(parameters);
    }

    public boolean shouldStartPlayback(long bufferedDurationUs, float playbackSpeed, boolean rebuffering, long targetLiveOffsetUs) {
        this.delegate.getClass();
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    @Override // g8.s0
    public void onTracksSelected(p1[] renderers, t1 trackGroups, q[] trackSelections) {
        renderers.getClass();
        trackGroups.getClass();
        trackSelections.getClass();
        this.delegate.onTracksSelected(renderers, trackGroups, trackSelections);
        throw null;
    }

    @Deprecated
    public void onTracksSelected(w wVar, r1 r1Var, h0 h0Var, p1[] p1VarArr, t1 t1Var, q[] qVarArr) {
        onTracksSelected(r1Var, h0Var, p1VarArr, t1Var, qVarArr);
    }

    @Override // g8.s0
    @Deprecated
    public void onTracksSelected(r1 r1Var, h0 h0Var, p1[] p1VarArr, t1 t1Var, q[] qVarArr) {
        onTracksSelected(p1VarArr, t1Var, qVarArr);
    }
}
