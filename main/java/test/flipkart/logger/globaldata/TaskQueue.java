package test.flipkart.logger.globaldata;

import java.util.ArrayDeque;
import java.util.Queue;

import LogModeWriter.mode.AsyncModeData;

public class TaskQueue {

	private static Queue<AsyncModeData> queue = new ArrayDeque<AsyncModeData>();

	public static Queue<AsyncModeData> getQueue() {
		return queue;
	}
}
