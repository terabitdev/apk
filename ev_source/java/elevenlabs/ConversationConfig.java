package io.elevenlabs;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import ho.l;
import ho.p;
import ho.q;
import ho.r;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import tn.u;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b]\b\u0086\b\u0018\u00002\u00020\u0001B·\u0005\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0010\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\"\b\u0002\u0010$\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\"\b\u0002\u0010%\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u001c\b\u0002\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018\u0012(\b\u0002\u0010*\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010)\u0012\"\b\u0002\u0010,\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010+\u0012\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u001e\b\u0002\u00100\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u00104J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u00104J\u0010\u00108\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u00104J\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b=\u00104J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u00104J\u0012\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b?\u0010@J\u001e\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u001e\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bC\u0010BJ\u001c\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0010HÆ\u0003¢\u0006\u0004\bD\u0010BJ\u001e\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bE\u0010FJ$\u0010G\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u001e\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bI\u0010FJ\u001e\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bJ\u0010FJ\u001e\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bK\u0010FJ\u001e\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bL\u0010FJ\u001e\u0010M\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bM\u0010FJ\u001e\u0010N\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bN\u0010FJ*\u0010O\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bO\u0010FJ*\u0010P\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bP\u0010FJ\u001e\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bQ\u0010FJ\u001e\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bR\u0010FJ$\u0010S\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bS\u0010HJ0\u0010T\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010)HÆ\u0003¢\u0006\u0004\bT\u0010UJ*\u0010V\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010+HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u001e\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bX\u0010FJ\u001e\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bY\u0010FJ&\u0010Z\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bZ\u0010HJÀ\u0005\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00102\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00182\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\"\b\u0002\u0010$\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\"\b\u0002\u0010%\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u001c\b\u0002\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00182(\b\u0002\u0010*\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010)2\"\b\u0002\u0010,\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010+2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u001e\b\u0002\u00100\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b]\u00104J\u0010\u0010^\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b^\u0010;J\u001a\u0010`\u001a\u00020\u00072\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b`\u0010aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010b\u001a\u0004\bc\u00104R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010b\u001a\u0004\bd\u00104R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010b\u001a\u0004\be\u00104R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010b\u001a\u0004\bf\u00104R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010g\u001a\u0004\bh\u00109R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010i\u001a\u0004\bj\u0010;R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010b\u001a\u0004\bk\u00104R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010b\u001a\u0004\bl\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010b\u001a\u0004\bm\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010n\u001a\u0004\bo\u0010@R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010p\u001a\u0004\bq\u0010BR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010p\u001a\u0004\br\u0010BR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010p\u001a\u0004\bs\u0010BR%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010t\u001a\u0004\bu\u0010FR+\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010v\u001a\u0004\bw\u0010HR%\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010t\u001a\u0004\bx\u0010FR%\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u0010t\u001a\u0004\by\u0010FR%\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001e\u0010t\u001a\u0004\bz\u0010FR%\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b \u0010t\u001a\u0004\b{\u0010FR%\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\"\u0010t\u001a\u0004\b|\u0010FR%\u0010#\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b#\u0010t\u001a\u0004\b}\u0010FR1\u0010$\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b$\u0010t\u001a\u0004\b~\u0010FR1\u0010%\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b%\u0010t\u001a\u0004\b\u007f\u0010FR&\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\r\n\u0004\b&\u0010t\u001a\u0005\b\u0080\u0001\u0010FR&\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\r\n\u0004\b'\u0010t\u001a\u0005\b\u0081\u0001\u0010FR,\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00188\u0006¢\u0006\r\n\u0004\b(\u0010v\u001a\u0005\b\u0082\u0001\u0010HR9\u0010*\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010)8\u0006¢\u0006\u000e\n\u0005\b*\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010UR3\u0010,\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010+8\u0006¢\u0006\u000e\n\u0005\b,\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010WR&\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\r\n\u0004\b-\u0010t\u001a\u0005\b\u0087\u0001\u0010FR&\u0010/\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\r\n\u0004\b/\u0010t\u001a\u0005\b\u0088\u0001\u0010FR.\u00100\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00188\u0006¢\u0006\r\n\u0004\b0\u0010v\u001a\u0005\b\u0089\u0001\u0010HR\u0013\u0010\u008a\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u00109¨\u0006\u008b\u0001"}, d2 = {"Lio/elevenlabs/ConversationConfig;", "", "", "agentId", "conversationToken", "signedUrl", "userId", "", "textOnly", "", "audioInputSampleRate", "apiEndpoint", "websocketUrl", "environment", "Lio/elevenlabs/Overrides;", "overrides", "", "customLlmExtraBody", "dynamicVariables", "Lio/elevenlabs/ClientTool;", "clientTools", "Lkotlin/Function1;", "Lsn/z;", "onConnect", "Lkotlin/Function2;", "onMessage", "Lio/elevenlabs/models/ConversationMode;", "onModeChange", "Lio/elevenlabs/models/ConversationStatus;", "onStatusChange", "onCanSendFeedbackChange", "Lio/elevenlabs/models/ConversationEvent$ClientToolCall;", "onUnhandledClientToolCall", "", "onVadScore", "onAudioLevelChanged", "onAudioAlignment", "onAgentResponseMetadata", "onUserTranscript", "onAgentResponse", "onAgentResponseCorrection", "Lkotlin/Function4;", "onAgentToolResponse", "Lkotlin/Function3;", "onConversationInitiationMetadata", "onInterruption", "Lio/elevenlabs/models/DisconnectionDetails;", "onDisconnect", "onError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/Overrides;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lho/l;Lho/p;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/p;Lho/r;Lho/q;Lho/l;Lho/l;Lho/p;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "()I", "component7", "component8", "component9", "component10", "()Lio/elevenlabs/Overrides;", "component11", "()Ljava/util/Map;", "component12", "component13", "component14", "()Lho/l;", "component15", "()Lho/p;", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "()Lho/r;", "component28", "()Lho/q;", "component29", "component30", "component31", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/Overrides;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lho/l;Lho/p;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/l;Lho/p;Lho/r;Lho/q;Lho/l;Lho/l;Lho/p;)Lio/elevenlabs/ConversationConfig;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgentId", "getConversationToken", "getSignedUrl", "getUserId", "Z", "getTextOnly", TokenNames.I, "getAudioInputSampleRate", "getApiEndpoint", "getWebsocketUrl", "getEnvironment", "Lio/elevenlabs/Overrides;", "getOverrides", "Ljava/util/Map;", "getCustomLlmExtraBody", "getDynamicVariables", "getClientTools", "Lho/l;", "getOnConnect", "Lho/p;", "getOnMessage", "getOnModeChange", "getOnStatusChange", "getOnCanSendFeedbackChange", "getOnUnhandledClientToolCall", "getOnVadScore", "getOnAudioLevelChanged", "getOnAudioAlignment", "getOnAgentResponseMetadata", "getOnUserTranscript", "getOnAgentResponse", "getOnAgentResponseCorrection", "Lho/r;", "getOnAgentToolResponse", "Lho/q;", "getOnConversationInitiationMetadata", "getOnInterruption", "getOnDisconnect", "getOnError", "isPrivateAgent", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ConversationConfig {
    private final String agentId;
    private final String apiEndpoint;
    private final int audioInputSampleRate;
    private final Map<String, ClientTool> clientTools;
    private final String conversationToken;
    private final Map<String, Object> customLlmExtraBody;
    private final Map<String, Object> dynamicVariables;
    private final String environment;
    private final l onAgentResponse;
    private final p onAgentResponseCorrection;
    private final l onAgentResponseMetadata;
    private final r onAgentToolResponse;
    private final l onAudioAlignment;
    private final l onAudioLevelChanged;
    private final l onCanSendFeedbackChange;
    private final l onConnect;
    private final q onConversationInitiationMetadata;
    private final l onDisconnect;
    private final p onError;
    private final l onInterruption;
    private final p onMessage;
    private final l onModeChange;
    private final l onStatusChange;
    private final l onUnhandledClientToolCall;
    private final l onUserTranscript;
    private final l onVadScore;
    private final Overrides overrides;
    private final String signedUrl;
    private final boolean textOnly;
    private final String userId;
    private final String websocketUrl;

    public /* synthetic */ ConversationConfig(String str, String str2, String str3, String str4, boolean z6, int i10, String str5, String str6, String str7, Overrides overrides, Map map, Map map2, Map map3, l lVar, p pVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, l lVar7, l lVar8, l lVar9, l lVar10, l lVar11, p pVar2, r rVar, q qVar, l lVar12, l lVar13, p pVar3, int i11, f fVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? false : z6, (i11 & 32) != 0 ? 48000 : i10, (i11 & 64) != 0 ? io.elevenlabs.readerapp.BuildConfig.API_URL : str5, (i11 & 128) != 0 ? "wss://livekit.rtc.elevenlabs.io" : str6, (i11 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : str7, (i11 & 512) != 0 ? null : overrides, (i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : map, (i11 & 2048) != 0 ? null : map2, (i11 & 4096) != 0 ? u.f33548a : map3, (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : lVar, (i11 & 16384) != 0 ? null : pVar, (i11 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? null : lVar2, (i11 & 65536) != 0 ? null : lVar3, (i11 & 131072) != 0 ? null : lVar4, (i11 & 262144) != 0 ? null : lVar5, (i11 & 524288) != 0 ? null : lVar6, (i11 & 1048576) != 0 ? null : lVar7, (i11 & 2097152) != 0 ? null : lVar8, (i11 & 4194304) != 0 ? null : lVar9, (i11 & 8388608) != 0 ? null : lVar10, (i11 & 16777216) != 0 ? null : lVar11, (i11 & 33554432) != 0 ? null : pVar2, (i11 & 67108864) != 0 ? null : rVar, (i11 & 134217728) != 0 ? null : qVar, (i11 & 268435456) != 0 ? null : lVar12, (i11 & 536870912) != 0 ? null : lVar13, (i11 & 1073741824) != 0 ? null : pVar3);
    }

    public static /* synthetic */ ConversationConfig copy$default(ConversationConfig conversationConfig, String str, String str2, String str3, String str4, boolean z6, int i10, String str5, String str6, String str7, Overrides overrides, Map map, Map map2, Map map3, l lVar, p pVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, l lVar7, l lVar8, l lVar9, l lVar10, l lVar11, p pVar2, r rVar, q qVar, l lVar12, l lVar13, p pVar3, int i11, Object obj) {
        p pVar4;
        l lVar14;
        String str8 = (i11 & 1) != 0 ? conversationConfig.agentId : str;
        String str9 = (i11 & 2) != 0 ? conversationConfig.conversationToken : str2;
        String str10 = (i11 & 4) != 0 ? conversationConfig.signedUrl : str3;
        String str11 = (i11 & 8) != 0 ? conversationConfig.userId : str4;
        boolean z10 = (i11 & 16) != 0 ? conversationConfig.textOnly : z6;
        int i12 = (i11 & 32) != 0 ? conversationConfig.audioInputSampleRate : i10;
        String str12 = (i11 & 64) != 0 ? conversationConfig.apiEndpoint : str5;
        String str13 = (i11 & 128) != 0 ? conversationConfig.websocketUrl : str6;
        String str14 = (i11 & RpcError.MAX_MESSAGE_BYTES) != 0 ? conversationConfig.environment : str7;
        Overrides overrides2 = (i11 & 512) != 0 ? conversationConfig.overrides : overrides;
        Map map4 = (i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? conversationConfig.customLlmExtraBody : map;
        Map map5 = (i11 & 2048) != 0 ? conversationConfig.dynamicVariables : map2;
        Map map6 = (i11 & 4096) != 0 ? conversationConfig.clientTools : map3;
        l lVar15 = (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? conversationConfig.onConnect : lVar;
        String str15 = str8;
        p pVar5 = (i11 & 16384) != 0 ? conversationConfig.onMessage : pVar;
        l lVar16 = (i11 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? conversationConfig.onModeChange : lVar2;
        l lVar17 = (i11 & 65536) != 0 ? conversationConfig.onStatusChange : lVar3;
        l lVar18 = (i11 & 131072) != 0 ? conversationConfig.onCanSendFeedbackChange : lVar4;
        l lVar19 = (i11 & 262144) != 0 ? conversationConfig.onUnhandledClientToolCall : lVar5;
        l lVar20 = (i11 & 524288) != 0 ? conversationConfig.onVadScore : lVar6;
        l lVar21 = (i11 & 1048576) != 0 ? conversationConfig.onAudioLevelChanged : lVar7;
        l lVar22 = (i11 & 2097152) != 0 ? conversationConfig.onAudioAlignment : lVar8;
        l lVar23 = (i11 & 4194304) != 0 ? conversationConfig.onAgentResponseMetadata : lVar9;
        l lVar24 = (i11 & 8388608) != 0 ? conversationConfig.onUserTranscript : lVar10;
        l lVar25 = (i11 & 16777216) != 0 ? conversationConfig.onAgentResponse : lVar11;
        p pVar6 = (i11 & 33554432) != 0 ? conversationConfig.onAgentResponseCorrection : pVar2;
        r rVar2 = (i11 & 67108864) != 0 ? conversationConfig.onAgentToolResponse : rVar;
        q qVar2 = (i11 & 134217728) != 0 ? conversationConfig.onConversationInitiationMetadata : qVar;
        l lVar26 = (i11 & 268435456) != 0 ? conversationConfig.onInterruption : lVar12;
        l lVar27 = (i11 & 536870912) != 0 ? conversationConfig.onDisconnect : lVar13;
        if ((i11 & 1073741824) != 0) {
            lVar14 = lVar27;
            pVar4 = conversationConfig.onError;
        } else {
            pVar4 = pVar3;
            lVar14 = lVar27;
        }
        return conversationConfig.copy(str15, str9, str10, str11, z10, i12, str12, str13, str14, overrides2, map4, map5, map6, lVar15, pVar5, lVar16, lVar17, lVar18, lVar19, lVar20, lVar21, lVar22, lVar23, lVar24, lVar25, pVar6, rVar2, qVar2, lVar26, lVar14, pVar4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* renamed from: component10, reason: from getter */
    public final Overrides getOverrides() {
        return this.overrides;
    }

    public final Map<String, Object> component11() {
        return this.customLlmExtraBody;
    }

    public final Map<String, Object> component12() {
        return this.dynamicVariables;
    }

    public final Map<String, ClientTool> component13() {
        return this.clientTools;
    }

    /* renamed from: component14, reason: from getter */
    public final l getOnConnect() {
        return this.onConnect;
    }

    /* renamed from: component15, reason: from getter */
    public final p getOnMessage() {
        return this.onMessage;
    }

    /* renamed from: component16, reason: from getter */
    public final l getOnModeChange() {
        return this.onModeChange;
    }

    /* renamed from: component17, reason: from getter */
    public final l getOnStatusChange() {
        return this.onStatusChange;
    }

    /* renamed from: component18, reason: from getter */
    public final l getOnCanSendFeedbackChange() {
        return this.onCanSendFeedbackChange;
    }

    /* renamed from: component19, reason: from getter */
    public final l getOnUnhandledClientToolCall() {
        return this.onUnhandledClientToolCall;
    }

    /* renamed from: component2, reason: from getter */
    public final String getConversationToken() {
        return this.conversationToken;
    }

    /* renamed from: component20, reason: from getter */
    public final l getOnVadScore() {
        return this.onVadScore;
    }

    /* renamed from: component21, reason: from getter */
    public final l getOnAudioLevelChanged() {
        return this.onAudioLevelChanged;
    }

    /* renamed from: component22, reason: from getter */
    public final l getOnAudioAlignment() {
        return this.onAudioAlignment;
    }

    /* renamed from: component23, reason: from getter */
    public final l getOnAgentResponseMetadata() {
        return this.onAgentResponseMetadata;
    }

    /* renamed from: component24, reason: from getter */
    public final l getOnUserTranscript() {
        return this.onUserTranscript;
    }

    /* renamed from: component25, reason: from getter */
    public final l getOnAgentResponse() {
        return this.onAgentResponse;
    }

    /* renamed from: component26, reason: from getter */
    public final p getOnAgentResponseCorrection() {
        return this.onAgentResponseCorrection;
    }

    /* renamed from: component27, reason: from getter */
    public final r getOnAgentToolResponse() {
        return this.onAgentToolResponse;
    }

    /* renamed from: component28, reason: from getter */
    public final q getOnConversationInitiationMetadata() {
        return this.onConversationInitiationMetadata;
    }

    /* renamed from: component29, reason: from getter */
    public final l getOnInterruption() {
        return this.onInterruption;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSignedUrl() {
        return this.signedUrl;
    }

    /* renamed from: component30, reason: from getter */
    public final l getOnDisconnect() {
        return this.onDisconnect;
    }

    /* renamed from: component31, reason: from getter */
    public final p getOnError() {
        return this.onError;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getTextOnly() {
        return this.textOnly;
    }

    /* renamed from: component6, reason: from getter */
    public final int getAudioInputSampleRate() {
        return this.audioInputSampleRate;
    }

    /* renamed from: component7, reason: from getter */
    public final String getApiEndpoint() {
        return this.apiEndpoint;
    }

    /* renamed from: component8, reason: from getter */
    public final String getWebsocketUrl() {
        return this.websocketUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    public final ConversationConfig copy(String agentId, String conversationToken, String signedUrl, String userId, boolean textOnly, int audioInputSampleRate, String apiEndpoint, String websocketUrl, String environment, Overrides overrides, Map<String, ? extends Object> customLlmExtraBody, Map<String, ? extends Object> dynamicVariables, Map<String, ? extends ClientTool> clientTools, l onConnect, p onMessage, l onModeChange, l onStatusChange, l onCanSendFeedbackChange, l onUnhandledClientToolCall, l onVadScore, l onAudioLevelChanged, l onAudioAlignment, l onAgentResponseMetadata, l onUserTranscript, l onAgentResponse, p onAgentResponseCorrection, r onAgentToolResponse, q onConversationInitiationMetadata, l onInterruption, l onDisconnect, p onError) {
        apiEndpoint.getClass();
        websocketUrl.getClass();
        clientTools.getClass();
        return new ConversationConfig(agentId, conversationToken, signedUrl, userId, textOnly, audioInputSampleRate, apiEndpoint, websocketUrl, environment, overrides, customLlmExtraBody, dynamicVariables, clientTools, onConnect, onMessage, onModeChange, onStatusChange, onCanSendFeedbackChange, onUnhandledClientToolCall, onVadScore, onAudioLevelChanged, onAudioAlignment, onAgentResponseMetadata, onUserTranscript, onAgentResponse, onAgentResponseCorrection, onAgentToolResponse, onConversationInitiationMetadata, onInterruption, onDisconnect, onError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationConfig)) {
            return false;
        }
        ConversationConfig conversationConfig = (ConversationConfig) other;
        if (m.c(this.agentId, conversationConfig.agentId) && m.c(this.conversationToken, conversationConfig.conversationToken) && m.c(this.signedUrl, conversationConfig.signedUrl) && m.c(this.userId, conversationConfig.userId) && this.textOnly == conversationConfig.textOnly && this.audioInputSampleRate == conversationConfig.audioInputSampleRate && m.c(this.apiEndpoint, conversationConfig.apiEndpoint) && m.c(this.websocketUrl, conversationConfig.websocketUrl) && m.c(this.environment, conversationConfig.environment) && m.c(this.overrides, conversationConfig.overrides) && m.c(this.customLlmExtraBody, conversationConfig.customLlmExtraBody) && m.c(this.dynamicVariables, conversationConfig.dynamicVariables) && m.c(this.clientTools, conversationConfig.clientTools) && m.c(this.onConnect, conversationConfig.onConnect) && m.c(this.onMessage, conversationConfig.onMessage) && m.c(this.onModeChange, conversationConfig.onModeChange) && m.c(this.onStatusChange, conversationConfig.onStatusChange) && m.c(this.onCanSendFeedbackChange, conversationConfig.onCanSendFeedbackChange) && m.c(this.onUnhandledClientToolCall, conversationConfig.onUnhandledClientToolCall) && m.c(this.onVadScore, conversationConfig.onVadScore) && m.c(this.onAudioLevelChanged, conversationConfig.onAudioLevelChanged) && m.c(this.onAudioAlignment, conversationConfig.onAudioAlignment) && m.c(this.onAgentResponseMetadata, conversationConfig.onAgentResponseMetadata) && m.c(this.onUserTranscript, conversationConfig.onUserTranscript) && m.c(this.onAgentResponse, conversationConfig.onAgentResponse) && m.c(this.onAgentResponseCorrection, conversationConfig.onAgentResponseCorrection) && m.c(this.onAgentToolResponse, conversationConfig.onAgentToolResponse) && m.c(this.onConversationInitiationMetadata, conversationConfig.onConversationInitiationMetadata) && m.c(this.onInterruption, conversationConfig.onInterruption) && m.c(this.onDisconnect, conversationConfig.onDisconnect) && m.c(this.onError, conversationConfig.onError)) {
            return true;
        }
        return false;
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getApiEndpoint() {
        return this.apiEndpoint;
    }

    public final int getAudioInputSampleRate() {
        return this.audioInputSampleRate;
    }

    public final Map<String, ClientTool> getClientTools() {
        return this.clientTools;
    }

    public final String getConversationToken() {
        return this.conversationToken;
    }

    public final Map<String, Object> getCustomLlmExtraBody() {
        return this.customLlmExtraBody;
    }

    public final Map<String, Object> getDynamicVariables() {
        return this.dynamicVariables;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final l getOnAgentResponse() {
        return this.onAgentResponse;
    }

    public final p getOnAgentResponseCorrection() {
        return this.onAgentResponseCorrection;
    }

    public final l getOnAgentResponseMetadata() {
        return this.onAgentResponseMetadata;
    }

    public final r getOnAgentToolResponse() {
        return this.onAgentToolResponse;
    }

    public final l getOnAudioAlignment() {
        return this.onAudioAlignment;
    }

    public final l getOnAudioLevelChanged() {
        return this.onAudioLevelChanged;
    }

    public final l getOnCanSendFeedbackChange() {
        return this.onCanSendFeedbackChange;
    }

    public final l getOnConnect() {
        return this.onConnect;
    }

    public final q getOnConversationInitiationMetadata() {
        return this.onConversationInitiationMetadata;
    }

    public final l getOnDisconnect() {
        return this.onDisconnect;
    }

    public final p getOnError() {
        return this.onError;
    }

    public final l getOnInterruption() {
        return this.onInterruption;
    }

    public final p getOnMessage() {
        return this.onMessage;
    }

    public final l getOnModeChange() {
        return this.onModeChange;
    }

    public final l getOnStatusChange() {
        return this.onStatusChange;
    }

    public final l getOnUnhandledClientToolCall() {
        return this.onUnhandledClientToolCall;
    }

    public final l getOnUserTranscript() {
        return this.onUserTranscript;
    }

    public final l getOnVadScore() {
        return this.onVadScore;
    }

    public final Overrides getOverrides() {
        return this.overrides;
    }

    public final String getSignedUrl() {
        return this.signedUrl;
    }

    public final boolean getTextOnly() {
        return this.textOnly;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getWebsocketUrl() {
        return this.websocketUrl;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        String str = this.agentId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.conversationToken;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.signedUrl;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.userId;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int c5 = c.c(c.c(c.b(this.audioInputSampleRate, com.google.android.gms.internal.play_billing.b.f((i13 + hashCode4) * 31, 31, this.textOnly), 31), 31, this.apiEndpoint), 31, this.websocketUrl);
        String str5 = this.environment;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i14 = (c5 + hashCode5) * 31;
        Overrides overrides = this.overrides;
        if (overrides == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = overrides.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        Map<String, Object> map = this.customLlmExtraBody;
        if (map == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = map.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        Map<String, Object> map2 = this.dynamicVariables;
        if (map2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = map2.hashCode();
        }
        int a10 = defpackage.f.a(this.clientTools, (i16 + hashCode8) * 31, 31);
        l lVar = this.onConnect;
        if (lVar == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = lVar.hashCode();
        }
        int i17 = (a10 + hashCode9) * 31;
        p pVar = this.onMessage;
        if (pVar == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = pVar.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        l lVar2 = this.onModeChange;
        if (lVar2 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = lVar2.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        l lVar3 = this.onStatusChange;
        if (lVar3 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = lVar3.hashCode();
        }
        int i20 = (i19 + hashCode12) * 31;
        l lVar4 = this.onCanSendFeedbackChange;
        if (lVar4 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = lVar4.hashCode();
        }
        int i21 = (i20 + hashCode13) * 31;
        l lVar5 = this.onUnhandledClientToolCall;
        if (lVar5 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = lVar5.hashCode();
        }
        int i22 = (i21 + hashCode14) * 31;
        l lVar6 = this.onVadScore;
        if (lVar6 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = lVar6.hashCode();
        }
        int i23 = (i22 + hashCode15) * 31;
        l lVar7 = this.onAudioLevelChanged;
        if (lVar7 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = lVar7.hashCode();
        }
        int i24 = (i23 + hashCode16) * 31;
        l lVar8 = this.onAudioAlignment;
        if (lVar8 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = lVar8.hashCode();
        }
        int i25 = (i24 + hashCode17) * 31;
        l lVar9 = this.onAgentResponseMetadata;
        if (lVar9 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = lVar9.hashCode();
        }
        int i26 = (i25 + hashCode18) * 31;
        l lVar10 = this.onUserTranscript;
        if (lVar10 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = lVar10.hashCode();
        }
        int i27 = (i26 + hashCode19) * 31;
        l lVar11 = this.onAgentResponse;
        if (lVar11 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = lVar11.hashCode();
        }
        int i28 = (i27 + hashCode20) * 31;
        p pVar2 = this.onAgentResponseCorrection;
        if (pVar2 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = pVar2.hashCode();
        }
        int i29 = (i28 + hashCode21) * 31;
        r rVar = this.onAgentToolResponse;
        if (rVar == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = rVar.hashCode();
        }
        int i30 = (i29 + hashCode22) * 31;
        q qVar = this.onConversationInitiationMetadata;
        if (qVar == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = qVar.hashCode();
        }
        int i31 = (i30 + hashCode23) * 31;
        l lVar12 = this.onInterruption;
        if (lVar12 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = lVar12.hashCode();
        }
        int i32 = (i31 + hashCode24) * 31;
        l lVar13 = this.onDisconnect;
        if (lVar13 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = lVar13.hashCode();
        }
        int i33 = (i32 + hashCode25) * 31;
        p pVar3 = this.onError;
        if (pVar3 != null) {
            i10 = pVar3.hashCode();
        }
        return i33 + i10;
    }

    public final boolean isPrivateAgent() {
        if (this.conversationToken == null && this.signedUrl == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str = this.agentId;
        String str2 = this.conversationToken;
        String str3 = this.signedUrl;
        String str4 = this.userId;
        boolean z6 = this.textOnly;
        int i10 = this.audioInputSampleRate;
        String str5 = this.apiEndpoint;
        String str6 = this.websocketUrl;
        String str7 = this.environment;
        Overrides overrides = this.overrides;
        Map<String, Object> map = this.customLlmExtraBody;
        Map<String, Object> map2 = this.dynamicVariables;
        Map<String, ClientTool> map3 = this.clientTools;
        l lVar = this.onConnect;
        p pVar = this.onMessage;
        l lVar2 = this.onModeChange;
        l lVar3 = this.onStatusChange;
        l lVar4 = this.onCanSendFeedbackChange;
        l lVar5 = this.onUnhandledClientToolCall;
        l lVar6 = this.onVadScore;
        l lVar7 = this.onAudioLevelChanged;
        l lVar8 = this.onAudioAlignment;
        l lVar9 = this.onAgentResponseMetadata;
        l lVar10 = this.onUserTranscript;
        l lVar11 = this.onAgentResponse;
        p pVar2 = this.onAgentResponseCorrection;
        r rVar = this.onAgentToolResponse;
        q qVar = this.onConversationInitiationMetadata;
        l lVar12 = this.onInterruption;
        l lVar13 = this.onDisconnect;
        p pVar3 = this.onError;
        StringBuilder s10 = defpackage.f.s("ConversationConfig(agentId=", str, ", conversationToken=", str2, ", signedUrl=");
        defpackage.f.x(s10, str3, ", userId=", str4, ", textOnly=");
        s10.append(z6);
        s10.append(", audioInputSampleRate=");
        s10.append(i10);
        s10.append(", apiEndpoint=");
        defpackage.f.x(s10, str5, ", websocketUrl=", str6, ", environment=");
        s10.append(str7);
        s10.append(", overrides=");
        s10.append(overrides);
        s10.append(", customLlmExtraBody=");
        s10.append(map);
        s10.append(", dynamicVariables=");
        s10.append(map2);
        s10.append(", clientTools=");
        s10.append(map3);
        s10.append(", onConnect=");
        s10.append(lVar);
        s10.append(", onMessage=");
        s10.append(pVar);
        s10.append(", onModeChange=");
        s10.append(lVar2);
        s10.append(", onStatusChange=");
        s10.append(lVar3);
        s10.append(", onCanSendFeedbackChange=");
        s10.append(lVar4);
        s10.append(", onUnhandledClientToolCall=");
        s10.append(lVar5);
        s10.append(", onVadScore=");
        s10.append(lVar6);
        s10.append(", onAudioLevelChanged=");
        s10.append(lVar7);
        s10.append(", onAudioAlignment=");
        s10.append(lVar8);
        s10.append(", onAgentResponseMetadata=");
        s10.append(lVar9);
        s10.append(", onUserTranscript=");
        s10.append(lVar10);
        s10.append(", onAgentResponse=");
        s10.append(lVar11);
        s10.append(", onAgentResponseCorrection=");
        s10.append(pVar2);
        s10.append(", onAgentToolResponse=");
        s10.append(rVar);
        s10.append(", onConversationInitiationMetadata=");
        s10.append(qVar);
        s10.append(", onInterruption=");
        s10.append(lVar12);
        s10.append(", onDisconnect=");
        s10.append(lVar13);
        s10.append(", onError=");
        s10.append(pVar3);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationConfig(String str, String str2, String str3, String str4, boolean z6, int i10, String str5, String str6, String str7, Overrides overrides, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends ClientTool> map3, l lVar, p pVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, l lVar7, l lVar8, l lVar9, l lVar10, l lVar11, p pVar2, r rVar, q qVar, l lVar12, l lVar13, p pVar3) {
        str5.getClass();
        str6.getClass();
        map3.getClass();
        this.agentId = str;
        this.conversationToken = str2;
        this.signedUrl = str3;
        this.userId = str4;
        this.textOnly = z6;
        this.audioInputSampleRate = i10;
        this.apiEndpoint = str5;
        this.websocketUrl = str6;
        this.environment = str7;
        this.overrides = overrides;
        this.customLlmExtraBody = map;
        this.dynamicVariables = map2;
        this.clientTools = map3;
        this.onConnect = lVar;
        this.onMessage = pVar;
        this.onModeChange = lVar2;
        this.onStatusChange = lVar3;
        this.onCanSendFeedbackChange = lVar4;
        this.onUnhandledClientToolCall = lVar5;
        this.onVadScore = lVar6;
        this.onAudioLevelChanged = lVar7;
        this.onAudioAlignment = lVar8;
        this.onAgentResponseMetadata = lVar9;
        this.onUserTranscript = lVar10;
        this.onAgentResponse = lVar11;
        this.onAgentResponseCorrection = pVar2;
        this.onAgentToolResponse = rVar;
        this.onConversationInitiationMetadata = qVar;
        this.onInterruption = lVar12;
        this.onDisconnect = lVar13;
        this.onError = pVar3;
        if (str != null && n.m0(str)) {
            c6.t("agentId cannot be blank");
            throw null;
        }
        if (str2 != null && n.m0(str2)) {
            c6.t("conversationToken cannot be blank");
            throw null;
        }
        if (str3 != null) {
            if (!n.m0(str3)) {
                if (!wq.u.W(str3, "ws://", false) && !wq.u.W(str3, "wss://", false)) {
                    c6.t("signedUrl must be a ws:// or wss:// URL");
                    throw null;
                }
            } else {
                c6.t("signedUrl cannot be blank");
                throw null;
            }
        }
        if (ig.f.I(8000, 16000, 22050, 44100, 48000).contains(Integer.valueOf(i10))) {
            return;
        }
        c6.t("audioInputSampleRate must be a standard sample rate (8000, 16000, 22050, 44100, 48000 Hz)");
        throw null;
    }

    public ConversationConfig() {
        this(null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, null);
    }
}
