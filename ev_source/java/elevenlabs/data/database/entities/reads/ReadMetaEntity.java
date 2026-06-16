package io.elevenlabs.data.database.entities.reads;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import p.n;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u0006\n\u0003\b\u0087\u0001\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010%\u001a\u00020\u0016\u0012\b\b\u0002\u0010&\u001a\u00020\u0016\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010+\u001a\u00020\u0016\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010-\u001a\u00020\u0016\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00104\u001a\u00020\u0016\u0012\b\b\u0002\u00105\u001a\u00020\u0016\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00107\u001a\u00020\u0016\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b\u0012\b\b\u0002\u0010<\u001a\u00020\u0016\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bA\u0010BJ\n\u0010\u0085\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\tHÆ\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0016HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bHÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0016HÆ\u0003J\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010bJ\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\u0011\u0010\u009e\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¡\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010bJ\n\u0010¢\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0016HÆ\u0003J\u0011\u0010¤\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0016HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0016HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¯\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010NJ\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0016HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0016HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¶\u0001\u001a\u0004\u0018\u00010:HÆ\u0003¢\u0006\u0002\u0010~J\u0010\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bHÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0016HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010»\u0001\u001a\u0004\u0018\u00010:HÆ\u0003¢\u0006\u0002\u0010~J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0094\u0005\u0010½\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010&\u001a\u00020\u00162\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010+\u001a\u00020\u00162\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010-\u001a\u00020\u00162\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00104\u001a\u00020\u00162\b\b\u0002\u00105\u001a\u00020\u00162\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00107\u001a\u00020\u00162\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\b\b\u0002\u0010<\u001a\u00020\u00162\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010?\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010¾\u0001J\u0016\u0010¿\u0001\u001a\u00020\u00162\t\u0010À\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\f\u0010Á\u0001\u001a\u00030Â\u0001HÖ\u0081\u0004J\u000b\u0010Ã\u0001\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010DR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010DR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bK\u0010JR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bL\u0010JR\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010O\u001a\u0004\bM\u0010NR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010DR\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010JR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010DR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010DR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010DR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010DR\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bV\u0010JR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010DR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u0010\u0017\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010YR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010DR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010DR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010DR\u0011\u0010\u001d\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b`\u0010YR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010c\u001a\u0004\ba\u0010bR\u0015\u0010 \u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010O\u001a\u0004\bd\u0010NR\u0015\u0010!\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010O\u001a\u0004\be\u0010NR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010DR\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010DR\u0015\u0010$\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010c\u001a\u0004\bh\u0010bR\u0011\u0010%\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b%\u0010YR\u0016\u0010&\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010YR\u001a\u0010'\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010O\u001a\u0004\bj\u0010NR\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010DR\u0018\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010DR\u0018\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010DR\u0016\u0010+\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010YR\u0018\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010DR\u0016\u0010-\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010YR\u0018\u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010DR\u0018\u0010/\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010DR\u0018\u00100\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010DR\u0018\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010DR\u001a\u00102\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010O\u001a\u0004\bt\u0010NR\u0018\u00103\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010DR\u001c\u00104\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bv\u0010w\u001a\u0004\bx\u0010YR\u0016\u00105\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010YR\u0018\u00106\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010DR\u0016\u00107\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010YR\u0018\u00108\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010DR\u001a\u00109\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u007f\u001a\u0004\b}\u0010~R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010^R\u0016\u0010<\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010YR\u0019\u0010=\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010DR\u0019\u0010>\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010DR\u001b\u0010?\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\u000b\n\u0002\u0010\u007f\u001a\u0005\b\u0083\u0001\u0010~R\u0019\u0010@\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010D¨\u0006Ä\u0001"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;", "", "read_id", "", "sync_state", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "article_image_url", "author", "char_count", "", "created_at_unix", "updated_at_unix", "added_at_unix", "description", "last_listened_char_offset", "source", "title", "subtitle", "url", "word_count", "original_file_type", "has_original_audio", "", "mature_content", FirebaseAnalytics.Param.ORIGIN, FirebaseAnalytics.Param.CONTENT_TYPE, "genre", "", "html_checksum", "from_user_import", "rating_average", "", "rating_count", "user_rating", "last_used_voice_id", "creation_status", "creation_progress", "is_archived", "marked_as_unread", "completed_at_unix", "publicationDate", "language", "publisherProfileId", "can_delete", "android_product_id", "is_paid", "previewAudio", "original_audio_voice_name", "original_audio_voice_image", "voice_selection_config", "sample_config_id", "display_mode", "in_user_library", "can_use_assistant", "audio_type", "use_drm", "last_listened_audio_file_number", "last_listened_audio_seconds", "", "audio_types", "is_voice_changer_on", "last_used_audio_type", "cover_image_urls", "cover_aspect_ratio", "blur_placeholder", "<init>", "(Ljava/lang/String;Lio/elevenlabs/data/database/entities/reads/SyncState;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/Long;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/Float;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;ZZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Double;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getRead_id", "()Ljava/lang/String;", "getSync_state", "()Lio/elevenlabs/data/database/entities/reads/SyncState;", "getArticle_image_url", "getAuthor", "getChar_count", "()J", "getCreated_at_unix", "getUpdated_at_unix", "getAdded_at_unix", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDescription", "getLast_listened_char_offset", "getSource", "getTitle", "getSubtitle", "getUrl", "getWord_count", "getOriginal_file_type", "getHas_original_audio", "()Z", "getMature_content", "getOrigin", "getContent_type", "getGenre", "()Ljava/util/List;", "getHtml_checksum", "getFrom_user_import", "getRating_average", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getRating_count", "getUser_rating", "getLast_used_voice_id", "getCreation_status", "getCreation_progress", "getMarked_as_unread", "getCompleted_at_unix", "getPublicationDate", "getLanguage", "getPublisherProfileId", "getCan_delete", "getAndroid_product_id", "getPreviewAudio", "getOriginal_audio_voice_name", "getOriginal_audio_voice_image", "getVoice_selection_config", "getSample_config_id", "getDisplay_mode", "getIn_user_library$annotations", "()V", "getIn_user_library", "getCan_use_assistant", "getAudio_type", "getUse_drm", "getLast_listened_audio_file_number", "getLast_listened_audio_seconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAudio_types", "getLast_used_audio_type", "getCover_image_urls", "getCover_aspect_ratio", "getBlur_placeholder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "copy", "(Ljava/lang/String;Lio/elevenlabs/data/database/entities/reads/SyncState;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/Long;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/Float;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;ZZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Double;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReadMetaEntity {
    private final Long added_at_unix;
    private final String android_product_id;
    private final String article_image_url;
    private final String audio_type;
    private final List<String> audio_types;
    private final String author;
    private final String blur_placeholder;
    private final boolean can_delete;
    private final boolean can_use_assistant;
    private final long char_count;
    private final Long completed_at_unix;
    private final String content_type;
    private final Double cover_aspect_ratio;
    private final String cover_image_urls;
    private final long created_at_unix;
    private final Float creation_progress;
    private final String creation_status;
    private final String description;
    private final String display_mode;
    private final boolean from_user_import;
    private final List<String> genre;
    private final boolean has_original_audio;
    private final String html_checksum;
    private final boolean in_user_library;
    private final boolean is_archived;
    private final boolean is_paid;
    private final boolean is_voice_changer_on;
    private final String language;
    private final String last_listened_audio_file_number;
    private final Double last_listened_audio_seconds;
    private final long last_listened_char_offset;
    private final String last_used_audio_type;
    private final String last_used_voice_id;
    private final boolean marked_as_unread;
    private final boolean mature_content;
    private final String origin;
    private final String original_audio_voice_image;
    private final String original_audio_voice_name;
    private final String original_file_type;
    private final String previewAudio;
    private final String publicationDate;
    private final String publisherProfileId;
    private final Float rating_average;
    private final Long rating_count;
    private final String read_id;
    private final Long sample_config_id;
    private final String source;
    private final String subtitle;
    private final SyncState sync_state;
    private final String title;
    private final long updated_at_unix;
    private final String url;
    private final boolean use_drm;
    private final Long user_rating;
    private final String voice_selection_config;
    private final long word_count;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ReadMetaEntity(String str, SyncState syncState, String str2, String str3, long j4, long j10, long j11, Long l4, String str4, long j12, String str5, String str6, String str7, String str8, long j13, String str9, boolean z6, boolean z10, String str10, String str11, List list, String str12, boolean z11, Float f10, Long l7, Long l10, String str13, String str14, Float f11, boolean z12, boolean z13, Long l11, String str15, String str16, String str17, boolean z14, String str18, boolean z15, String str19, String str20, String str21, String str22, Long l12, String str23, boolean z16, boolean z17, String str24, boolean z18, String str25, Double d10, List list2, boolean z19, String str26, String str27, Double d11, String str28, int i10, int i11, kotlin.jvm.internal.f fVar) {
        this(str, syncState, str2, str3, j4, j10, j11, l4, str4, j12, str5, str6, str7, str8, j13, r25, r26, r27, r28, r29, r9 != 0 ? r10 : list, (i10 & 2097152) != 0 ? null : str12, (i10 & 4194304) != 0 ? true : z11, (i10 & 8388608) != 0 ? null : f10, (i10 & 16777216) != 0 ? null : l7, (i10 & 33554432) != 0 ? null : l10, (i10 & 67108864) != 0 ? null : str13, (i10 & 134217728) != 0 ? null : str14, (i10 & 268435456) != 0 ? null : f11, (i10 & 536870912) != 0 ? false : z12, (i10 & 1073741824) != 0 ? false : z13, (i10 & Integer.MIN_VALUE) != 0 ? null : l11, (i11 & 1) != 0 ? null : str15, (i11 & 2) != 0 ? null : str16, (i11 & 4) != 0 ? null : str17, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? null : str18, (i11 & 32) != 0 ? false : z15, (i11 & 64) != 0 ? null : str19, (i11 & 128) != 0 ? null : str20, (i11 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : str21, (i11 & 512) != 0 ? null : str22, (i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : l12, (i11 & 2048) != 0 ? null : str23, (i11 & 4096) != 0 ? false : z16, (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? false : z17, (i11 & 16384) != 0 ? null : str24, (32768 & i11) != 0 ? false : z18, (i11 & 65536) != 0 ? null : str25, (i11 & 131072) != 0 ? null : d10, (i11 & 262144) != 0 ? r10 : list2, (i11 & 524288) != 0 ? false : z19, (i11 & 1048576) != 0 ? null : str26, (i11 & 2097152) != 0 ? null : str27, (i11 & 4194304) != 0 ? null : d11, (i11 & 8388608) != 0 ? null : str28);
        String str29 = (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? null : str9;
        boolean z20 = (i10 & 65536) != 0 ? false : z6;
        boolean z21 = (i10 & 131072) != 0 ? false : z10;
        String str30 = (i10 & 262144) != 0 ? null : str10;
        String str31 = (i10 & 524288) != 0 ? null : str11;
        int i12 = i10 & 1048576;
        t tVar = t.f33547a;
    }

    public static /* synthetic */ ReadMetaEntity copy$default(ReadMetaEntity readMetaEntity, String str, SyncState syncState, String str2, String str3, long j4, long j10, long j11, Long l4, String str4, long j12, String str5, String str6, String str7, String str8, long j13, String str9, boolean z6, boolean z10, String str10, String str11, List list, String str12, boolean z11, Float f10, Long l7, Long l10, String str13, String str14, Float f11, boolean z12, boolean z13, Long l11, String str15, String str16, String str17, boolean z14, String str18, boolean z15, String str19, String str20, String str21, String str22, Long l12, String str23, boolean z16, boolean z17, String str24, boolean z18, String str25, Double d10, List list2, boolean z19, String str26, String str27, Double d11, String str28, int i10, int i11, Object obj) {
        String str29 = (i10 & 1) != 0 ? readMetaEntity.read_id : str;
        SyncState syncState2 = (i10 & 2) != 0 ? readMetaEntity.sync_state : syncState;
        String str30 = (i10 & 4) != 0 ? readMetaEntity.article_image_url : str2;
        String str31 = (i10 & 8) != 0 ? readMetaEntity.author : str3;
        long j14 = (i10 & 16) != 0 ? readMetaEntity.char_count : j4;
        long j15 = (i10 & 32) != 0 ? readMetaEntity.created_at_unix : j10;
        long j16 = (i10 & 64) != 0 ? readMetaEntity.updated_at_unix : j11;
        Long l13 = (i10 & 128) != 0 ? readMetaEntity.added_at_unix : l4;
        String str32 = (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? readMetaEntity.description : str4;
        String str33 = str29;
        SyncState syncState3 = syncState2;
        long j17 = (i10 & 512) != 0 ? readMetaEntity.last_listened_char_offset : j12;
        return readMetaEntity.copy(str33, syncState3, str30, str31, j14, j15, j16, l13, str32, j17, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? readMetaEntity.source : str5, (i10 & 2048) != 0 ? readMetaEntity.title : str6, (i10 & 4096) != 0 ? readMetaEntity.subtitle : str7, (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? readMetaEntity.url : str8, (i10 & 16384) != 0 ? readMetaEntity.word_count : j13, (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? readMetaEntity.original_file_type : str9, (i10 & 65536) != 0 ? readMetaEntity.has_original_audio : z6, (i10 & 131072) != 0 ? readMetaEntity.mature_content : z10, (i10 & 262144) != 0 ? readMetaEntity.origin : str10, (i10 & 524288) != 0 ? readMetaEntity.content_type : str11, (i10 & 1048576) != 0 ? readMetaEntity.genre : list, (i10 & 2097152) != 0 ? readMetaEntity.html_checksum : str12, (i10 & 4194304) != 0 ? readMetaEntity.from_user_import : z11, (i10 & 8388608) != 0 ? readMetaEntity.rating_average : f10, (i10 & 16777216) != 0 ? readMetaEntity.rating_count : l7, (i10 & 33554432) != 0 ? readMetaEntity.user_rating : l10, (i10 & 67108864) != 0 ? readMetaEntity.last_used_voice_id : str13, (i10 & 134217728) != 0 ? readMetaEntity.creation_status : str14, (i10 & 268435456) != 0 ? readMetaEntity.creation_progress : f11, (i10 & 536870912) != 0 ? readMetaEntity.is_archived : z12, (i10 & 1073741824) != 0 ? readMetaEntity.marked_as_unread : z13, (i10 & Integer.MIN_VALUE) != 0 ? readMetaEntity.completed_at_unix : l11, (i11 & 1) != 0 ? readMetaEntity.publicationDate : str15, (i11 & 2) != 0 ? readMetaEntity.language : str16, (i11 & 4) != 0 ? readMetaEntity.publisherProfileId : str17, (i11 & 8) != 0 ? readMetaEntity.can_delete : z14, (i11 & 16) != 0 ? readMetaEntity.android_product_id : str18, (i11 & 32) != 0 ? readMetaEntity.is_paid : z15, (i11 & 64) != 0 ? readMetaEntity.previewAudio : str19, (i11 & 128) != 0 ? readMetaEntity.original_audio_voice_name : str20, (i11 & RpcError.MAX_MESSAGE_BYTES) != 0 ? readMetaEntity.original_audio_voice_image : str21, (i11 & 512) != 0 ? readMetaEntity.voice_selection_config : str22, (i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? readMetaEntity.sample_config_id : l12, (i11 & 2048) != 0 ? readMetaEntity.display_mode : str23, (i11 & 4096) != 0 ? readMetaEntity.in_user_library : z16, (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? readMetaEntity.can_use_assistant : z17, (i11 & 16384) != 0 ? readMetaEntity.audio_type : str24, (i11 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? readMetaEntity.use_drm : z18, (i11 & 65536) != 0 ? readMetaEntity.last_listened_audio_file_number : str25, (i11 & 131072) != 0 ? readMetaEntity.last_listened_audio_seconds : d10, (i11 & 262144) != 0 ? readMetaEntity.audio_types : list2, (i11 & 524288) != 0 ? readMetaEntity.is_voice_changer_on : z19, (i11 & 1048576) != 0 ? readMetaEntity.last_used_audio_type : str26, (i11 & 2097152) != 0 ? readMetaEntity.cover_image_urls : str27, (i11 & 4194304) != 0 ? readMetaEntity.cover_aspect_ratio : d11, (i11 & 8388608) != 0 ? readMetaEntity.blur_placeholder : str28);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRead_id() {
        return this.read_id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getLast_listened_char_offset() {
        return this.last_listened_char_offset;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component14, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component15, reason: from getter */
    public final long getWord_count() {
        return this.word_count;
    }

    /* renamed from: component16, reason: from getter */
    public final String getOriginal_file_type() {
        return this.original_file_type;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getHas_original_audio() {
        return this.has_original_audio;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getMature_content() {
        return this.mature_content;
    }

    /* renamed from: component19, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component2, reason: from getter */
    public final SyncState getSync_state() {
        return this.sync_state;
    }

    /* renamed from: component20, reason: from getter */
    public final String getContent_type() {
        return this.content_type;
    }

    public final List<String> component21() {
        return this.genre;
    }

    /* renamed from: component22, reason: from getter */
    public final String getHtml_checksum() {
        return this.html_checksum;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getFrom_user_import() {
        return this.from_user_import;
    }

    /* renamed from: component24, reason: from getter */
    public final Float getRating_average() {
        return this.rating_average;
    }

    /* renamed from: component25, reason: from getter */
    public final Long getRating_count() {
        return this.rating_count;
    }

    /* renamed from: component26, reason: from getter */
    public final Long getUser_rating() {
        return this.user_rating;
    }

    /* renamed from: component27, reason: from getter */
    public final String getLast_used_voice_id() {
        return this.last_used_voice_id;
    }

    /* renamed from: component28, reason: from getter */
    public final String getCreation_status() {
        return this.creation_status;
    }

    /* renamed from: component29, reason: from getter */
    public final Float getCreation_progress() {
        return this.creation_progress;
    }

    /* renamed from: component3, reason: from getter */
    public final String getArticle_image_url() {
        return this.article_image_url;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getIs_archived() {
        return this.is_archived;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getMarked_as_unread() {
        return this.marked_as_unread;
    }

    /* renamed from: component32, reason: from getter */
    public final Long getCompleted_at_unix() {
        return this.completed_at_unix;
    }

    /* renamed from: component33, reason: from getter */
    public final String getPublicationDate() {
        return this.publicationDate;
    }

    /* renamed from: component34, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component35, reason: from getter */
    public final String getPublisherProfileId() {
        return this.publisherProfileId;
    }

    /* renamed from: component36, reason: from getter */
    public final boolean getCan_delete() {
        return this.can_delete;
    }

    /* renamed from: component37, reason: from getter */
    public final String getAndroid_product_id() {
        return this.android_product_id;
    }

    /* renamed from: component38, reason: from getter */
    public final boolean getIs_paid() {
        return this.is_paid;
    }

    /* renamed from: component39, reason: from getter */
    public final String getPreviewAudio() {
        return this.previewAudio;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* renamed from: component40, reason: from getter */
    public final String getOriginal_audio_voice_name() {
        return this.original_audio_voice_name;
    }

    /* renamed from: component41, reason: from getter */
    public final String getOriginal_audio_voice_image() {
        return this.original_audio_voice_image;
    }

    /* renamed from: component42, reason: from getter */
    public final String getVoice_selection_config() {
        return this.voice_selection_config;
    }

    /* renamed from: component43, reason: from getter */
    public final Long getSample_config_id() {
        return this.sample_config_id;
    }

    /* renamed from: component44, reason: from getter */
    public final String getDisplay_mode() {
        return this.display_mode;
    }

    /* renamed from: component45, reason: from getter */
    public final boolean getIn_user_library() {
        return this.in_user_library;
    }

    /* renamed from: component46, reason: from getter */
    public final boolean getCan_use_assistant() {
        return this.can_use_assistant;
    }

    /* renamed from: component47, reason: from getter */
    public final String getAudio_type() {
        return this.audio_type;
    }

    /* renamed from: component48, reason: from getter */
    public final boolean getUse_drm() {
        return this.use_drm;
    }

    /* renamed from: component49, reason: from getter */
    public final String getLast_listened_audio_file_number() {
        return this.last_listened_audio_file_number;
    }

    /* renamed from: component5, reason: from getter */
    public final long getChar_count() {
        return this.char_count;
    }

    /* renamed from: component50, reason: from getter */
    public final Double getLast_listened_audio_seconds() {
        return this.last_listened_audio_seconds;
    }

    public final List<String> component51() {
        return this.audio_types;
    }

    /* renamed from: component52, reason: from getter */
    public final boolean getIs_voice_changer_on() {
        return this.is_voice_changer_on;
    }

    /* renamed from: component53, reason: from getter */
    public final String getLast_used_audio_type() {
        return this.last_used_audio_type;
    }

    /* renamed from: component54, reason: from getter */
    public final String getCover_image_urls() {
        return this.cover_image_urls;
    }

    /* renamed from: component55, reason: from getter */
    public final Double getCover_aspect_ratio() {
        return this.cover_aspect_ratio;
    }

    /* renamed from: component56, reason: from getter */
    public final String getBlur_placeholder() {
        return this.blur_placeholder;
    }

    /* renamed from: component6, reason: from getter */
    public final long getCreated_at_unix() {
        return this.created_at_unix;
    }

    /* renamed from: component7, reason: from getter */
    public final long getUpdated_at_unix() {
        return this.updated_at_unix;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getAdded_at_unix() {
        return this.added_at_unix;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final ReadMetaEntity copy(String read_id, SyncState sync_state, String article_image_url, String author, long char_count, long created_at_unix, long updated_at_unix, Long added_at_unix, String description, long last_listened_char_offset, String source, String title, String subtitle, String url, long word_count, String original_file_type, boolean has_original_audio, boolean mature_content, String origin, String content_type, List<String> genre, String html_checksum, boolean from_user_import, Float rating_average, Long rating_count, Long user_rating, String last_used_voice_id, String creation_status, Float creation_progress, boolean is_archived, boolean marked_as_unread, Long completed_at_unix, String publicationDate, String language, String publisherProfileId, boolean can_delete, String android_product_id, boolean is_paid, String previewAudio, String original_audio_voice_name, String original_audio_voice_image, String voice_selection_config, Long sample_config_id, String display_mode, boolean in_user_library, boolean can_use_assistant, String audio_type, boolean use_drm, String last_listened_audio_file_number, Double last_listened_audio_seconds, List<String> audio_types, boolean is_voice_changer_on, String last_used_audio_type, String cover_image_urls, Double cover_aspect_ratio, String blur_placeholder) {
        read_id.getClass();
        sync_state.getClass();
        genre.getClass();
        audio_types.getClass();
        return new ReadMetaEntity(read_id, sync_state, article_image_url, author, char_count, created_at_unix, updated_at_unix, added_at_unix, description, last_listened_char_offset, source, title, subtitle, url, word_count, original_file_type, has_original_audio, mature_content, origin, content_type, genre, html_checksum, from_user_import, rating_average, rating_count, user_rating, last_used_voice_id, creation_status, creation_progress, is_archived, marked_as_unread, completed_at_unix, publicationDate, language, publisherProfileId, can_delete, android_product_id, is_paid, previewAudio, original_audio_voice_name, original_audio_voice_image, voice_selection_config, sample_config_id, display_mode, in_user_library, can_use_assistant, audio_type, use_drm, last_listened_audio_file_number, last_listened_audio_seconds, audio_types, is_voice_changer_on, last_used_audio_type, cover_image_urls, cover_aspect_ratio, blur_placeholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadMetaEntity)) {
            return false;
        }
        ReadMetaEntity readMetaEntity = (ReadMetaEntity) other;
        if (m.c(this.read_id, readMetaEntity.read_id) && this.sync_state == readMetaEntity.sync_state && m.c(this.article_image_url, readMetaEntity.article_image_url) && m.c(this.author, readMetaEntity.author) && this.char_count == readMetaEntity.char_count && this.created_at_unix == readMetaEntity.created_at_unix && this.updated_at_unix == readMetaEntity.updated_at_unix && m.c(this.added_at_unix, readMetaEntity.added_at_unix) && m.c(this.description, readMetaEntity.description) && this.last_listened_char_offset == readMetaEntity.last_listened_char_offset && m.c(this.source, readMetaEntity.source) && m.c(this.title, readMetaEntity.title) && m.c(this.subtitle, readMetaEntity.subtitle) && m.c(this.url, readMetaEntity.url) && this.word_count == readMetaEntity.word_count && m.c(this.original_file_type, readMetaEntity.original_file_type) && this.has_original_audio == readMetaEntity.has_original_audio && this.mature_content == readMetaEntity.mature_content && m.c(this.origin, readMetaEntity.origin) && m.c(this.content_type, readMetaEntity.content_type) && m.c(this.genre, readMetaEntity.genre) && m.c(this.html_checksum, readMetaEntity.html_checksum) && this.from_user_import == readMetaEntity.from_user_import && m.c(this.rating_average, readMetaEntity.rating_average) && m.c(this.rating_count, readMetaEntity.rating_count) && m.c(this.user_rating, readMetaEntity.user_rating) && m.c(this.last_used_voice_id, readMetaEntity.last_used_voice_id) && m.c(this.creation_status, readMetaEntity.creation_status) && m.c(this.creation_progress, readMetaEntity.creation_progress) && this.is_archived == readMetaEntity.is_archived && this.marked_as_unread == readMetaEntity.marked_as_unread && m.c(this.completed_at_unix, readMetaEntity.completed_at_unix) && m.c(this.publicationDate, readMetaEntity.publicationDate) && m.c(this.language, readMetaEntity.language) && m.c(this.publisherProfileId, readMetaEntity.publisherProfileId) && this.can_delete == readMetaEntity.can_delete && m.c(this.android_product_id, readMetaEntity.android_product_id) && this.is_paid == readMetaEntity.is_paid && m.c(this.previewAudio, readMetaEntity.previewAudio) && m.c(this.original_audio_voice_name, readMetaEntity.original_audio_voice_name) && m.c(this.original_audio_voice_image, readMetaEntity.original_audio_voice_image) && m.c(this.voice_selection_config, readMetaEntity.voice_selection_config) && m.c(this.sample_config_id, readMetaEntity.sample_config_id) && m.c(this.display_mode, readMetaEntity.display_mode) && this.in_user_library == readMetaEntity.in_user_library && this.can_use_assistant == readMetaEntity.can_use_assistant && m.c(this.audio_type, readMetaEntity.audio_type) && this.use_drm == readMetaEntity.use_drm && m.c(this.last_listened_audio_file_number, readMetaEntity.last_listened_audio_file_number) && m.c(this.last_listened_audio_seconds, readMetaEntity.last_listened_audio_seconds) && m.c(this.audio_types, readMetaEntity.audio_types) && this.is_voice_changer_on == readMetaEntity.is_voice_changer_on && m.c(this.last_used_audio_type, readMetaEntity.last_used_audio_type) && m.c(this.cover_image_urls, readMetaEntity.cover_image_urls) && m.c(this.cover_aspect_ratio, readMetaEntity.cover_aspect_ratio) && m.c(this.blur_placeholder, readMetaEntity.blur_placeholder)) {
            return true;
        }
        return false;
    }

    public final Long getAdded_at_unix() {
        return this.added_at_unix;
    }

    public final String getAndroid_product_id() {
        return this.android_product_id;
    }

    public final String getArticle_image_url() {
        return this.article_image_url;
    }

    public final String getAudio_type() {
        return this.audio_type;
    }

    public final List<String> getAudio_types() {
        return this.audio_types;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getBlur_placeholder() {
        return this.blur_placeholder;
    }

    public final boolean getCan_delete() {
        return this.can_delete;
    }

    public final boolean getCan_use_assistant() {
        return this.can_use_assistant;
    }

    public final long getChar_count() {
        return this.char_count;
    }

    public final Long getCompleted_at_unix() {
        return this.completed_at_unix;
    }

    public final String getContent_type() {
        return this.content_type;
    }

    public final Double getCover_aspect_ratio() {
        return this.cover_aspect_ratio;
    }

    public final String getCover_image_urls() {
        return this.cover_image_urls;
    }

    public final long getCreated_at_unix() {
        return this.created_at_unix;
    }

    public final Float getCreation_progress() {
        return this.creation_progress;
    }

    public final String getCreation_status() {
        return this.creation_status;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplay_mode() {
        return this.display_mode;
    }

    public final boolean getFrom_user_import() {
        return this.from_user_import;
    }

    public final List<String> getGenre() {
        return this.genre;
    }

    public final boolean getHas_original_audio() {
        return this.has_original_audio;
    }

    public final String getHtml_checksum() {
        return this.html_checksum;
    }

    public final boolean getIn_user_library() {
        return this.in_user_library;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLast_listened_audio_file_number() {
        return this.last_listened_audio_file_number;
    }

    public final Double getLast_listened_audio_seconds() {
        return this.last_listened_audio_seconds;
    }

    public final long getLast_listened_char_offset() {
        return this.last_listened_char_offset;
    }

    public final String getLast_used_audio_type() {
        return this.last_used_audio_type;
    }

    public final String getLast_used_voice_id() {
        return this.last_used_voice_id;
    }

    public final boolean getMarked_as_unread() {
        return this.marked_as_unread;
    }

    public final boolean getMature_content() {
        return this.mature_content;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getOriginal_audio_voice_image() {
        return this.original_audio_voice_image;
    }

    public final String getOriginal_audio_voice_name() {
        return this.original_audio_voice_name;
    }

    public final String getOriginal_file_type() {
        return this.original_file_type;
    }

    public final String getPreviewAudio() {
        return this.previewAudio;
    }

    public final String getPublicationDate() {
        return this.publicationDate;
    }

    public final String getPublisherProfileId() {
        return this.publisherProfileId;
    }

    public final Float getRating_average() {
        return this.rating_average;
    }

    public final Long getRating_count() {
        return this.rating_count;
    }

    public final String getRead_id() {
        return this.read_id;
    }

    public final Long getSample_config_id() {
        return this.sample_config_id;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final SyncState getSync_state() {
        return this.sync_state;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getUpdated_at_unix() {
        return this.updated_at_unix;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getUse_drm() {
        return this.use_drm;
    }

    public final Long getUser_rating() {
        return this.user_rating;
    }

    public final String getVoice_selection_config() {
        return this.voice_selection_config;
    }

    public final long getWord_count() {
        return this.word_count;
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
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        int hashCode36 = (this.sync_state.hashCode() + (this.read_id.hashCode() * 31)) * 31;
        String str = this.article_image_url;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode36 + hashCode) * 31;
        String str2 = this.author;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int g10 = com.google.android.gms.internal.play_billing.b.g(this.updated_at_unix, com.google.android.gms.internal.play_billing.b.g(this.created_at_unix, com.google.android.gms.internal.play_billing.b.g(this.char_count, (i11 + hashCode2) * 31, 31), 31), 31);
        Long l4 = this.added_at_unix;
        if (l4 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l4.hashCode();
        }
        int i12 = (g10 + hashCode3) * 31;
        String str3 = this.description;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int g11 = com.google.android.gms.internal.play_billing.b.g(this.last_listened_char_offset, (i12 + hashCode4) * 31, 31);
        String str4 = this.source;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i13 = (g11 + hashCode5) * 31;
        String str5 = this.title;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str6 = this.subtitle;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str7 = this.url;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int g12 = com.google.android.gms.internal.play_billing.b.g(this.word_count, (i15 + hashCode8) * 31, 31);
        String str8 = this.original_file_type;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((g12 + hashCode9) * 31, 31, this.has_original_audio), 31, this.mature_content);
        String str9 = this.origin;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i16 = (f10 + hashCode10) * 31;
        String str10 = this.content_type;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int d10 = n.d((i16 + hashCode11) * 31, 31, this.genre);
        String str11 = this.html_checksum;
        if (str11 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str11.hashCode();
        }
        int f11 = com.google.android.gms.internal.play_billing.b.f((d10 + hashCode12) * 31, 31, this.from_user_import);
        Float f12 = this.rating_average;
        if (f12 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = f12.hashCode();
        }
        int i17 = (f11 + hashCode13) * 31;
        Long l7 = this.rating_count;
        if (l7 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = l7.hashCode();
        }
        int i18 = (i17 + hashCode14) * 31;
        Long l10 = this.user_rating;
        if (l10 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = l10.hashCode();
        }
        int i19 = (i18 + hashCode15) * 31;
        String str12 = this.last_used_voice_id;
        if (str12 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str12.hashCode();
        }
        int i20 = (i19 + hashCode16) * 31;
        String str13 = this.creation_status;
        if (str13 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str13.hashCode();
        }
        int i21 = (i20 + hashCode17) * 31;
        Float f13 = this.creation_progress;
        if (f13 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = f13.hashCode();
        }
        int f14 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((i21 + hashCode18) * 31, 31, this.is_archived), 31, this.marked_as_unread);
        Long l11 = this.completed_at_unix;
        if (l11 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = l11.hashCode();
        }
        int i22 = (f14 + hashCode19) * 31;
        String str14 = this.publicationDate;
        if (str14 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str14.hashCode();
        }
        int i23 = (i22 + hashCode20) * 31;
        String str15 = this.language;
        if (str15 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str15.hashCode();
        }
        int i24 = (i23 + hashCode21) * 31;
        String str16 = this.publisherProfileId;
        if (str16 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = str16.hashCode();
        }
        int f15 = com.google.android.gms.internal.play_billing.b.f((i24 + hashCode22) * 31, 31, this.can_delete);
        String str17 = this.android_product_id;
        if (str17 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = str17.hashCode();
        }
        int f16 = com.google.android.gms.internal.play_billing.b.f((f15 + hashCode23) * 31, 31, this.is_paid);
        String str18 = this.previewAudio;
        if (str18 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = str18.hashCode();
        }
        int i25 = (f16 + hashCode24) * 31;
        String str19 = this.original_audio_voice_name;
        if (str19 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = str19.hashCode();
        }
        int i26 = (i25 + hashCode25) * 31;
        String str20 = this.original_audio_voice_image;
        if (str20 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = str20.hashCode();
        }
        int i27 = (i26 + hashCode26) * 31;
        String str21 = this.voice_selection_config;
        if (str21 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = str21.hashCode();
        }
        int i28 = (i27 + hashCode27) * 31;
        Long l12 = this.sample_config_id;
        if (l12 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = l12.hashCode();
        }
        int i29 = (i28 + hashCode28) * 31;
        String str22 = this.display_mode;
        if (str22 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = str22.hashCode();
        }
        int f17 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((i29 + hashCode29) * 31, 31, this.in_user_library), 31, this.can_use_assistant);
        String str23 = this.audio_type;
        if (str23 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = str23.hashCode();
        }
        int f18 = com.google.android.gms.internal.play_billing.b.f((f17 + hashCode30) * 31, 31, this.use_drm);
        String str24 = this.last_listened_audio_file_number;
        if (str24 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = str24.hashCode();
        }
        int i30 = (f18 + hashCode31) * 31;
        Double d11 = this.last_listened_audio_seconds;
        if (d11 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = d11.hashCode();
        }
        int f19 = com.google.android.gms.internal.play_billing.b.f(n.d((i30 + hashCode32) * 31, 31, this.audio_types), 31, this.is_voice_changer_on);
        String str25 = this.last_used_audio_type;
        if (str25 == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = str25.hashCode();
        }
        int i31 = (f19 + hashCode33) * 31;
        String str26 = this.cover_image_urls;
        if (str26 == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = str26.hashCode();
        }
        int i32 = (i31 + hashCode34) * 31;
        Double d12 = this.cover_aspect_ratio;
        if (d12 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = d12.hashCode();
        }
        int i33 = (i32 + hashCode35) * 31;
        String str27 = this.blur_placeholder;
        if (str27 != null) {
            i10 = str27.hashCode();
        }
        return i33 + i10;
    }

    public final boolean is_archived() {
        return this.is_archived;
    }

    public final boolean is_paid() {
        return this.is_paid;
    }

    public final boolean is_voice_changer_on() {
        return this.is_voice_changer_on;
    }

    public String toString() {
        String str = this.read_id;
        SyncState syncState = this.sync_state;
        String str2 = this.article_image_url;
        String str3 = this.author;
        long j4 = this.char_count;
        long j10 = this.created_at_unix;
        long j11 = this.updated_at_unix;
        Long l4 = this.added_at_unix;
        String str4 = this.description;
        long j12 = this.last_listened_char_offset;
        String str5 = this.source;
        String str6 = this.title;
        String str7 = this.subtitle;
        String str8 = this.url;
        long j13 = this.word_count;
        String str9 = this.original_file_type;
        boolean z6 = this.has_original_audio;
        boolean z10 = this.mature_content;
        String str10 = this.origin;
        String str11 = this.content_type;
        List<String> list = this.genre;
        String str12 = this.html_checksum;
        boolean z11 = this.from_user_import;
        Float f10 = this.rating_average;
        Long l7 = this.rating_count;
        Long l10 = this.user_rating;
        String str13 = this.last_used_voice_id;
        String str14 = this.creation_status;
        Float f11 = this.creation_progress;
        boolean z12 = this.is_archived;
        boolean z13 = this.marked_as_unread;
        Long l11 = this.completed_at_unix;
        String str15 = this.publicationDate;
        String str16 = this.language;
        String str17 = this.publisherProfileId;
        boolean z14 = this.can_delete;
        String str18 = this.android_product_id;
        boolean z15 = this.is_paid;
        String str19 = this.previewAudio;
        String str20 = this.original_audio_voice_name;
        String str21 = this.original_audio_voice_image;
        String str22 = this.voice_selection_config;
        Long l12 = this.sample_config_id;
        String str23 = this.display_mode;
        boolean z16 = this.in_user_library;
        boolean z17 = this.can_use_assistant;
        String str24 = this.audio_type;
        boolean z18 = this.use_drm;
        String str25 = this.last_listened_audio_file_number;
        Double d10 = this.last_listened_audio_seconds;
        List<String> list2 = this.audio_types;
        boolean z19 = this.is_voice_changer_on;
        String str26 = this.last_used_audio_type;
        String str27 = this.cover_image_urls;
        Double d11 = this.cover_aspect_ratio;
        String str28 = this.blur_placeholder;
        StringBuilder sb = new StringBuilder("ReadMetaEntity(read_id=");
        sb.append(str);
        sb.append(", sync_state=");
        sb.append(syncState);
        sb.append(", article_image_url=");
        defpackage.f.x(sb, str2, ", author=", str3, ", char_count=");
        sb.append(j4);
        com.google.android.gms.internal.play_billing.b.w(sb, ", created_at_unix=", j10, ", updated_at_unix=");
        sb.append(j11);
        sb.append(", added_at_unix=");
        sb.append(l4);
        defpackage.f.w(sb, ", description=", str4, ", last_listened_char_offset=");
        sb.append(j12);
        sb.append(", source=");
        sb.append(str5);
        defpackage.f.x(sb, ", title=", str6, ", subtitle=", str7);
        defpackage.f.w(sb, ", url=", str8, ", word_count=");
        sb.append(j13);
        sb.append(", original_file_type=");
        sb.append(str9);
        sb.append(", has_original_audio=");
        sb.append(z6);
        sb.append(", mature_content=");
        sb.append(z10);
        defpackage.f.x(sb, ", origin=", str10, ", content_type=", str11);
        sb.append(", genre=");
        sb.append(list);
        sb.append(", html_checksum=");
        sb.append(str12);
        sb.append(", from_user_import=");
        sb.append(z11);
        sb.append(", rating_average=");
        sb.append(f10);
        sb.append(", rating_count=");
        sb.append(l7);
        sb.append(", user_rating=");
        sb.append(l10);
        defpackage.f.x(sb, ", last_used_voice_id=", str13, ", creation_status=", str14);
        sb.append(", creation_progress=");
        sb.append(f11);
        sb.append(", is_archived=");
        sb.append(z12);
        sb.append(", marked_as_unread=");
        sb.append(z13);
        sb.append(", completed_at_unix=");
        sb.append(l11);
        defpackage.f.x(sb, ", publicationDate=", str15, ", language=", str16);
        sb.append(", publisherProfileId=");
        sb.append(str17);
        sb.append(", can_delete=");
        sb.append(z14);
        sb.append(", android_product_id=");
        sb.append(str18);
        sb.append(", is_paid=");
        sb.append(z15);
        defpackage.f.x(sb, ", previewAudio=", str19, ", original_audio_voice_name=", str20);
        defpackage.f.x(sb, ", original_audio_voice_image=", str21, ", voice_selection_config=", str22);
        sb.append(", sample_config_id=");
        sb.append(l12);
        sb.append(", display_mode=");
        sb.append(str23);
        sb.append(", in_user_library=");
        sb.append(z16);
        sb.append(", can_use_assistant=");
        sb.append(z17);
        sb.append(", audio_type=");
        sb.append(str24);
        sb.append(", use_drm=");
        sb.append(z18);
        sb.append(", last_listened_audio_file_number=");
        sb.append(str25);
        sb.append(", last_listened_audio_seconds=");
        sb.append(d10);
        sb.append(", audio_types=");
        sb.append(list2);
        sb.append(", is_voice_changer_on=");
        sb.append(z19);
        defpackage.f.x(sb, ", last_used_audio_type=", str26, ", cover_image_urls=", str27);
        sb.append(", cover_aspect_ratio=");
        sb.append(d11);
        sb.append(", blur_placeholder=");
        sb.append(str28);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public ReadMetaEntity(String str, SyncState syncState, String str2, String str3, long j4, long j10, long j11, Long l4, String str4, long j12, String str5, String str6, String str7, String str8, long j13, String str9, boolean z6, boolean z10, String str10, String str11, List<String> list, String str12, boolean z11, Float f10, Long l7, Long l10, String str13, String str14, Float f11, boolean z12, boolean z13, Long l11, String str15, String str16, String str17, boolean z14, String str18, boolean z15, String str19, String str20, String str21, String str22, Long l12, String str23, boolean z16, boolean z17, String str24, boolean z18, String str25, Double d10, List<String> list2, boolean z19, String str26, String str27, Double d11, String str28) {
        str.getClass();
        syncState.getClass();
        list.getClass();
        list2.getClass();
        this.read_id = str;
        this.sync_state = syncState;
        this.article_image_url = str2;
        this.author = str3;
        this.char_count = j4;
        this.created_at_unix = j10;
        this.updated_at_unix = j11;
        this.added_at_unix = l4;
        this.description = str4;
        this.last_listened_char_offset = j12;
        this.source = str5;
        this.title = str6;
        this.subtitle = str7;
        this.url = str8;
        this.word_count = j13;
        this.original_file_type = str9;
        this.has_original_audio = z6;
        this.mature_content = z10;
        this.origin = str10;
        this.content_type = str11;
        this.genre = list;
        this.html_checksum = str12;
        this.from_user_import = z11;
        this.rating_average = f10;
        this.rating_count = l7;
        this.user_rating = l10;
        this.last_used_voice_id = str13;
        this.creation_status = str14;
        this.creation_progress = f11;
        this.is_archived = z12;
        this.marked_as_unread = z13;
        this.completed_at_unix = l11;
        this.publicationDate = str15;
        this.language = str16;
        this.publisherProfileId = str17;
        this.can_delete = z14;
        this.android_product_id = str18;
        this.is_paid = z15;
        this.previewAudio = str19;
        this.original_audio_voice_name = str20;
        this.original_audio_voice_image = str21;
        this.voice_selection_config = str22;
        this.sample_config_id = l12;
        this.display_mode = str23;
        this.in_user_library = z16;
        this.can_use_assistant = z17;
        this.audio_type = str24;
        this.use_drm = z18;
        this.last_listened_audio_file_number = str25;
        this.last_listened_audio_seconds = d10;
        this.audio_types = list2;
        this.is_voice_changer_on = z19;
        this.last_used_audio_type = str26;
        this.cover_image_urls = str27;
        this.cover_aspect_ratio = d11;
        this.blur_placeholder = str28;
    }

    @sn.c
    public static /* synthetic */ void getIn_user_library$annotations() {
    }
}
